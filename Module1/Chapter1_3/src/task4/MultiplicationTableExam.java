package task4;
import java.util.Scanner;
public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){

            int score = 0;

            // loop for multiplication problems
            for (int i = 1; i <= 10; i++){
                int number1 = (int)(Math.random() * 10) + 1;
                int number2 = (int)(Math.random() * 10) + 1;

                System.out.print( i +  " : What is " + number1 + " * " + number2 + " ? " );
                int answer = input.nextInt();

                if (answer == number1 * number2){
                    score++;
                }else {
                    System.out.println("Wrong Answer");
                }
            }

            // after 10 problems answer, check score

            if (score == 10){
                System.out.println("Great! you got full score that is : " + score);
            }else{
                System.out.println("You score " + score +" /10. Try again to get full score !");
            }

            // ask to play again after one round is finished

            System.out.print(" Do you want to play again ?  (y/n) :");
            input.nextLine();
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                System.out.println(" Thanks for playing.");
                break;
            }
        }
    }
}
