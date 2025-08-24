package task1;
//Write a program that prompts the user to enter the coefficients of a quadratic equation (ax^2 + bx + c = 0) and
// calculates its roots using the quadratic formula. Display the roots on the console. If the equation has no real
// roots, display the message "No real roots".

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Give the value for a : ");
        double a = read.nextDouble();
        System.out.println("Give the value for b : ");
        double b = read.nextDouble();
        System.out.println("Give the value for c : ");
        double c = read.nextDouble();

        double d = (Math.pow(b, 2) - (4 * a * c));

        if (d < 0) {
            System.out.println("This equation has no real roots");

        } else {
            double quadraticRoot1 = (-b + Math.sqrt(d) / (2 * a));
            double quadraticRoot2 = (-b - Math.sqrt(d) / (2 * a));

            if (d == 0) {
                System.out.println("This equation has only one real roots" + quadraticRoot1);

            } else {
                System.out.println(" This equation has two real roots");
                System.out.println("It's root is: " + quadraticRoot1);
                System.out.println("It's root is: " + quadraticRoot2);
            }
        }


    }
}
