import java.io.FileWriter;
import java.io.IOException;

public class ProductDataToCSV {

    public static void main(String[] args) {

        String[][] products = {
                {"Mobile", "15000", "4.5"},
                {"Laptop", "55000", "4.2"},
                {"Headphones", "2000", "4.0"}
        };

        try (FileWriter writer = new FileWriter("products.csv")) {

            writer.write("Product, Price, Rating\n");
            writer.write("\n");

            for (String[] product : products) {
                writer.write(
                        product[0] + ", " +
                        product[1] + ", " +
                        product[2] + "\n"
                );
            }

            System.out.println("Product data successfully saved in CSV file..!");

        } catch (IOException e) {
            System.out.println("Error while writing CSV file.");
        }
    }
}