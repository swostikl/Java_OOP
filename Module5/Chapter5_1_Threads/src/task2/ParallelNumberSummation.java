package task2;

import java.util.Random;

public class ParallelNumberSummation extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private long partialSum;

    public ParallelNumberSummation(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += numbers[i];
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

class ParallelSum {
    public static void main(String[] args) {
        int n = 100000; // array size
        int[] num = new int[n];
        Random rand = new Random();

        // fill array with random integers (0–99)
        for (int i = 0; i < n; i++) {
            num[i] = rand.nextInt(100);
        }

        int cores = Runtime.getRuntime().availableProcessors(); // find number of CPU cores
        System.out.println("Available processor cores: " + cores);

        ParallelNumberSummation[] tasks = new ParallelNumberSummation[cores];
        int chunkSize = n / cores;

        // create and start threads
        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? n : start + chunkSize;

            tasks[i] = new ParallelNumberSummation(num, start, end);
            tasks[i].start(); // directly start thread
        }

        // wait for all threads
        for (int i = 0; i < cores; i++) {
            try {
                tasks[i].join();
            } catch (InterruptedException e) {
                System.err.println(" Thread interrupted : " + e.getMessage());
            }
        }


        long totalSum = 0;
        for (ParallelNumberSummation task : tasks) {
            totalSum += task.getPartialSum(); // collect result
        }

        System.out.println("Final sum: " + totalSum);
    }
}
