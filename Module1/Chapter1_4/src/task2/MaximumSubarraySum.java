package task2;

import java.util.Scanner;
public class MaximumSubarraySum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array : ");
        int n = input.nextInt();

        int [] arr = new int [n];

        for(int a = 0; a < n; a++){
            System.out.print(a + "." + " Enter integers in the array : " );
            arr[a] = input.nextInt();
        }

        //max sum and indices
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        // iterating all possible subarrays
         for(int i = 0; i < n; i++){
             int CurrentSum = 0;
             for(int j = i; j < n; j++){
             CurrentSum += arr[j];

             if(CurrentSum > maxSum){
                 maxSum = CurrentSum;
                 startIndex = i;
                 endIndex = j;
             }
             }
         }
        // output
        System.out.println("Maximum Subarray Sum is " + maxSum);
         System.out.println("Subarray  indices (1-based) " + (startIndex + 1) + " to " + (endIndex + 1));


    }
}
