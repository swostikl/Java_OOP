package task3;

//Leiviskä, naula and luoti are medieval Finnish units of measurement.

//One leiviskä is 20 naula.
//One naula is 32 luoti.
//One luoti is 13.28 grams.

//Write a program that asks the user for a weight in grams and converts it to medieval measurements: leiviskä, naula,
// and luoti. The program should work in the following way:

//That is, leiviskä and naula are printed as integers, and luoti is printed with two decimal places.

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" weight (g)  : ");
        int weight = Integer.parseInt(input.nextLine());

        double luoti = weight / 13.28 ;

        //calculation of leiviskä
        double leiviskä = luoti / (20*32);
        luoti = luoti % (32 * 20) ;

        //Calculation of naula
        double naula = luoti / 32;
        luoti = luoti % 32;

        System.out.printf("%d grams is  %d leiviskä , %d naula, and  %6.2f luoti. ", weight, (int)leiviskä , (int)naula, luoti );



    }
}
