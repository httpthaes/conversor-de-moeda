import com.google.gson.JsonObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiClient api = new ApiClient();
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        JsonObject resposta = api.buscarTaxas();
        JsonObject rates = resposta.getAsJsonObject("conversion_rates");


        System.out.println("Digite um valor em USD para converter:");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite para qual moeda deseja converter:");
        System.out.println("""
        ARS - Peso argentino
        BOB - Boliviano boliviano
        BRL - Real brasileiro
        CLP - Peso chileno
        COP - Peso colombiano
        USD - Dólar americano
        """);

        String tipoMoeda = scanner.nextLine().toUpperCase();

        double taxa = FiltroMoedas.filtrar(rates, tipoMoeda);

        double valorFinal = conversorMoeda.converter(valor, taxa);

        System.out.println(valor + " USD em " + tipoMoeda + " = " + valorFinal);
    }
}