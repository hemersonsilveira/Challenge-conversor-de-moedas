import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cambio {
    private static final String API_KEY = "2c0a370705dc48236befdf81";

    public double converterMoedas(String moedaBase, String moedaAlvo, double valor) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaBase);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Moedas moedas = new Gson().fromJson(response.body(), Moedas.class);

            if (!"success".equals(moedas.getResult())) {
                throw new RuntimeException("Erro ao obter dados da API: " + moedas.getResult());
            }

            double taxaCambio = getTaxaCambio(moedas, moedaAlvo);
            return valor * taxaCambio;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao converter moedas.", e);
        }
    }

    private double getTaxaCambio(Moedas moedas, String moedaAlvo) {
        Moedas.ConversionRates rates = moedas.getConversion_rates();
        switch (moedaAlvo) {
            case "USD":
                return rates.getUSD();
            case "BRL":
                return rates.getBRL();
            case "ARS":
                return rates.getARS();
            case "COP":
                return rates.getCOP();
            default:
                throw new IllegalArgumentException("Moeda alvo não suportada: " + moedaAlvo);
        }
    }
}