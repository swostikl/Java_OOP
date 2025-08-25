package task1;
//Task 1: Fahrenheit to Celsius Converter

import java.util.Scanner;
public class TemperatureConvertor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double temperature = Double.parseDouble(input.nextLine());

        double celsius = (temperature-32)*5/9;
        System.out.printf("Celsius : %6.2f  %s\n" , celsius , "degree");
    }
}
