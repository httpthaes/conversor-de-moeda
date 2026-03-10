import com.google.gson.JsonObject;

public class FiltroMoedas {
    public static double filtrar(JsonObject rates, String moeda) {
        return rates.get(moeda).getAsDouble();
    }
}
