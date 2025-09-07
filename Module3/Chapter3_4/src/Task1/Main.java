package Task1;

// Checking whether there is data for 1st jan 2023 by separating each in different column

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");

            // Open the connection
            InputStream istream = myUrl.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(istream));

            String line;

            while ((line = reader.readLine()) != null) {

                // Split by semicolon (the CSV separator)
                String[] columns = line.split(";");

                // Example: print all dat
                System.out.println("Time: " + columns[0] + " | UlkoTalo: " + columns[1]);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }
}
