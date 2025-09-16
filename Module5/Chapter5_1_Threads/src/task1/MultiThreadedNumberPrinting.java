package task1;

//Write a Java program that uses two threads to print numbers alternately. One thread should print odd numbers, and the
// other thread should print even numbers. The program should allow specifying a range of numbers to be printed. The
// output should be something like this:


class OddThread extends Thread{
    private int counter;
    OddThread(int counter) {
        this.counter = counter;
    }
    public void run(){
        for(int i = 1; i< counter; i += 2){
            System.out.println("Odd Thread : " + i);
            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                return;
            }

        }
    }
}

class EvenThread extends Thread{
    private int counter;
    EvenThread(int counter){
        this.counter = counter ;
    }
    public void run(){
        for(int i = 2; i <= counter; i +=2){
            System.out.println("Even Thread : " + i);
            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                return;
            }
        }

    }

}

public class MultiThreadedNumberPrinting{
    public static void main (String[] args){
        int range= 20; //setting value
        Thread oddThread = new OddThread(range);
        Thread evenThread = new EvenThread(range);


        try {
            evenThread.start();
            evenThread.join(); // wait for even thread to finish

            oddThread.start();
            oddThread.join(); // wait for odd thread to finish


        }catch (InterruptedException e){
            return;
        }
        System.out.println("Printing Complete.");

    }
}