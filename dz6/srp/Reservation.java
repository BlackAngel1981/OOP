package srp;

import java.io.FileWriter;
import java.io.IOException;

public class Reservation {

    public void saveToJson(Order order) {
//        String fileName = "order.json";
        String filePath = "/Volumes/DATA/Development/GeekBrains/Java_oop/java_oop6/src/srp/Order.json";
        try (FileWriter writer = new FileWriter(filePath, false)) {
            writer.write("{\n");
            writer.write("\"clientName\": \"" + order.getClientName() + "\",\n");
            writer.write("\"email\": \"" + order.getEmail() + "\",\n");
            writer.write("\"product\": \"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\": " + order.getQnt() + ",\n");
            writer.write("\"price\": " + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
