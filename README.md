# 🪙 Conversor de Moedas - Java

Este é um projeto de console desenvolvido em Java que realiza a conversão de moedas em tempo real, utilizando a **ExchangeRate-API** para obter as taxas de câmbio atualizadas.

## 🚀 Funcionalidades

* **Integração com API**: Consumo de taxas de câmbio via HTTP.
* **Conversões Suportadas**: Suporte para conversão de USD (Dólar) para:
    * **ARS** - Peso argentino
    * **BOB** - Boliviano boliviano
    * **BRL** - Real brasileiro
    * **CLP** - Peso chileno
    * **COP** - Peso colombiano
* **Segurança**: Uso de variáveis de ambiente para proteção da chave de API.
* **Processamento JSON**: Utilização da biblioteca Gson para manipulação de dados.

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **HttpClient**: Para requisições de rede.
* **Gson**: Para o parse dos dados JSON.
* **ExchangeRate-API**: Fonte oficial dos dados de câmbio.

## 📋 Pré-requisitos

1.  Obtenha uma chave gratuita em [ExchangeRate-API](https://www.exchangerate-api.com/).
2.  Configure uma variável de ambiente no seu sistema chamada `MINHA_API_KEY` com o valor da sua chave.

## 🔧 Estrutura do Projeto

O código está organizado nas seguintes classes:

* **`Main`**: Orquestra a interação com o usuário e o fluxo do programa.
* **`ApiClient`**: Gerencia a conexão HTTP e busca os dados da API.
* **`FiltroMoedas`**: Extrai a taxa de câmbio específica do JSON retornado.
* **`ConversorMoeda`**: Executa o cálculo matemático da conversão.

## 💻 Como Executar

1.  Clone o repositório:
    ```bash
    git clone https://github.com/httpthaes/conversor-de-moeda.git
    ```
2.  Importe o projeto em sua IDE (IntelliJ, Eclipse ou VS Code).
3.  Adicione a biblioteca **Gson** ao seu classpath.
4.  Execute a classe `Main.java`.

---
