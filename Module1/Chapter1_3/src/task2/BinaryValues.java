package task2;
//Write a program that prompts the user to enter a binary number (composed of 0s and 1s) and converts it to decimal.
// Display the decimal equivalent on the console. Hint: use the charAt method of the String class to retrieve the
// individual bits in the input string.


import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Binary number : ");
        String binaryValue = read.nextLine();

        int binaryIntoDecimal = 0;
        int length =binaryValue.length();

        for(int i = 0; i < length; i++){
            char bitChar = binaryValue.charAt(i); // get character at position i
            int bit =bitChar - '0';  // convert character into int '1'= 1 and '0'= 0

      // from right to left
            binaryIntoDecimal = binaryIntoDecimal * 2 + bit;
        }

        System.out.println("Binary number into decimal is  : " + binaryIntoDecimal);
    }
}
