package Task2;

//Generate number sequence and store it to a CSV file for spreadsheet application
//Generate a Fibonacci sequence of 60 numbers and write them to a CSV file. Then read the content of the file with a
// spreadsheet application.
//Note that the Fibonacci number of 60 is 1548008755920 that is too large to be stored in a 32-bit integer. Therefore,
// you need to use long data type instead of int. Please note also that the sequence starts with 0 and 1 and depending
// on your algorithm, it may take time to calculate the sequence.

import java.io.FileWriter;
import java.io.IOException;


public class GenerateNumberSequence {
    public static void main (String[] args){
        int n = 60;
        long [] Fibonacci = new long [n];

        //first 2 numbers as Fibonacci sequence always start with 0,1
        Fibonacci[0] = 0;
        Fibonacci[1] = 1 ;

        // to generate sequence
        for (int i = 2; i < n ;i++){
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i - 2];
        }
        // write CSV file
        try (FileWriter writer = new FileWriter("fibonacci.csv")){
            for (int i = 0; i < n; i++){
                writer.write(Fibonacci[i] + "\n"); // add new line manually
            }
        } catch (IOException e){
            System.err.println (" Error!!!" );
        }
        System.out.println("The generated Fibonacci sequence number is saved fibonacci.csv.");
        System.out.println(" Open spreadsheet to see the fibonacci.csv file.");

    }
}
