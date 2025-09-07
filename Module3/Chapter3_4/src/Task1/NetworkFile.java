package Task1;


//Read a CSV file from the network location

//There is a network file (https://users.metropolia.fi/~jarkkov/temploki.csv) where we have periodical temperature
// measurements at 10 minutes interval. Create an application which reads the file, reads the 'UlkoTalo' column, and
// calculates the average temperature for the 1st day of January 2023.



import java.net.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class NetworkFile {
    public static void main(String[] args) {
        try {
           URL myURL = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");

            //Open the connection and get the input stream
            InputStream istream = myURL.openStream();

            // jump to character streams
            InputStreamReader istreamreader = new InputStreamReader(istream);

            // add buffered reader for efficiency
            BufferedReader reader = new BufferedReader(istreamreader);
            String line;
            boolean firstLine = true; // to skip header

            double sum =0.0;
            int count = 0;

            // date-time format in the file
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss" );
            while ((line = reader.readLine()) != null){
                if (firstLine){
                    firstLine= false;
                    continue;
                }
                //Split by semicolon

                String [] parts = line.split(";");
                if(parts.length < 2) continue;

                try{
                    // parse timestamp (first column)
                    LocalDateTime timestamp = LocalDateTime.parse(parts[0], formatter);
                    // check if date is 1st jan 2023
                    if (timestamp.toLocalDate().toString().equals("2023-01-01")){
                        //parse ulkotalo
                        double temperature = Double.parseDouble(parts[1]);
                        sum += temperature;
                        count++;
                    }
                }catch (DateTimeParseException | NumberFormatException e){
                    System.out.println();
                }
            }
            reader.close();

            if (count>0){
                double average = sum / count ;
                System.out.println(" Average temperature on 1st January 2023 : " + average);
            }else {
                System.out.println(" No data foound!");
            }

        }catch(IOException e){
            System.out.print(" Error reading file " + e);
        }
    }
}