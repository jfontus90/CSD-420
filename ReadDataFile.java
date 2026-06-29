import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFile {

    public static void main(String[] args) {

        String fileName = "Fontus_datafile.dat"; // must match writer file

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("=== FILE CONTENTS ===\n");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
