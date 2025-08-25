package task3;

// Write a program that prompts the user to enter two positive integers, start and end (where start < end). The program
// should generate and display all the prime numbers between start and end, inclusive.
//A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.
//Your program should use control structures (such as loops and conditional statements) to implement the logic for
// generating and checking prime numbers.


import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a start number: ");
        int start = input.nextInt();

        System.out.println("Enter a end number: ");
        int end = input.nextInt();

        // check validate input
        if (start >= end || start < 1) {
            System.out.println("Invalid input, enter the positive number : ");
        }else {
            System.out.println("Prime numbers between " + start + " and " + end + " are : ");

            for(int number = start; number <= end; number++){
                if (isPrime(number)){
                    System.out.print(number + " ");
                }
            }

        }


    }

    public static boolean isPrime(int number){
        if (number <=1){
            return false;
        }

        for (int i = 2; i  <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }

        }
        return true;
    }
}
