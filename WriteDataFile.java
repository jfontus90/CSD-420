import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class WriteDataFile {

    public static void main(String[] args) {

        String fileName = "Fontus_datafile.dat"; // change to your last name
        Random rand = new Random();

        int[] ints = new int[5];
        double[] doubles = new double[5];

        for (int i = 0; i < 5; i++) {
            ints[i] = rand.nextInt(100);
            doubles[i] = rand.nextDouble() * 100;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {

            writer.println("=== New Data Set ===");

            writer.print("Integers: ");
            for (int num : ints) {
                writer.print(num + " ");
            }

            writer.println();

            writer.print("Doubles: ");
            for (double num : doubles) {
                writer.print(num + " ");
            }

            writer.println();
            writer.println();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
