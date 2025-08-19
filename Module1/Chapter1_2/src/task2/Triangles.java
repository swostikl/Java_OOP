package task2;
//Write a program that asks the user for the lengths of the legs of a right triangle and prints the length of the
// hypotenuse of the triangle.

import java.util.Scanner;
public class Triangles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out .println("Enter the height of a triangle : ");
        double height = Double.parseDouble(input.nextLine());

        System.out.println("Enter the width of a triangle : ");
        double base = Double.parseDouble(input.nextLine());

        double c = Math.sqrt(Math.pow(height,2) + Math.pow(base,2));
        System.out.printf("The length of a hypotenuse of triangle is %.2f \n", c);
    }
}
