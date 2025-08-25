package task1;

import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" How many random names would you like to generate ? ");
        int num = input.nextInt();

        String[] firstNames ={"Swostika", "Puun", "Sailesh", "Sharmila", "John", "Mikko", "Hanna", "Hasna"} ;
        String[] lastNames ={"Lama","Subhamani", "Karki", "Gyawali", "Smith", "Virtanen", "Brown", "Mahdi"};

        System.out.println("Generated random names are : ");
        for (int i = 1; i <=num; i++) {

            int firstIndex = (int)(Math.random()*(firstNames.length));
            int lastIndex = (int)(Math.random()*(lastNames.length));

            // combine 1st and last names

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];
            System.out.println(i +". "+fullName);
        }


    }
}
