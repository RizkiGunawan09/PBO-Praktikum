import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();

            // Baca file JSON
            FileReader reader = new FileReader(".\\src\\data.json");
            Delivery[] deliveries = gson.fromJson(reader, Delivery[].class);

            // Akses data dari objek Java (Delivery)
            for(Delivery delivery:deliveries) {
                System.out.println("-".repeat(50));
                delivery.getBill(delivery);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
