//This code doesn't include the input.txt file and the output.csv file
import java.io.*;
import java.util.*;

public class AddressConverter {
    public static void main(String[] args) throws IOException {

        // Input file
        Scanner fileInput = new Scanner(new File("input.txt"));

        // Output file
        PrintWriter output = new PrintWriter("output.csv");

        // Write CSV header
        output.println("Street,City,State,Zip");

        // Read two lines at a time
        while (fileInput.hasNextLine()) {
            String street = fileInput.nextLine();
            String cityStateZip = fileInput.nextLine();

            // Split city and state/zip
            String[] parts = cityStateZip.split(",");
            String city = parts[0].trim();

            // Split state and zip
            String[] stateZip = parts[1].trim().split(" ");
            String state = stateZip[0];
            String zip = stateZip[1];

            // Write to CSV
            output.println(street + "," + city + "," + state + "," + zip);
        }

        fileInput.close();
        output.close();

        System.out.println("Conversion complete!");
    }
}
