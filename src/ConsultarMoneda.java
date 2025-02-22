import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion= URI.create("https://v6.exchangerate-api.com/v6/0e09cd66e2433b5b065d9c27/pair/"
                +monedaBase+"/"+monedaTarget);

        try {
            HttpClient client= HttpClient.newHttpClient();
            HttpRequest request= HttpRequest.newBuilder()
                .uri(direccion)
                .build();

            HttpResponse<String> response= client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);

        }catch (Exception e){
            throw new RuntimeException("Moneda no encontrada");
        }
    }
}
