package task3;

import java.util.Scanner;
public class RemoveDuplicates {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Enter the size of the array: ");
         int size = input.nextInt();

         int[] array = new int[size];
         for(int i = 0; i < array.length; i++){
             System.out.print(i +"." + " Enter the elements of the array: ");
             array[i] = input.nextInt();
         }

         int [] UniqueArray = new int[size];
         int count = 0;
         for(int i = 0; i < UniqueArray.length; i++){
             boolean isDuplicate = false;
             for(int j = 0; j < count; j++){
                 if(UniqueArray[j] == array[i]){
                     isDuplicate = true;
                     break;
                 }
             }
             if(!isDuplicate){
                 UniqueArray[count] = array[i];
                 count++;
             }
         }
         System.out.println(" Array after removing duplicates is : ");
         for(int i = 0; i < count; i++){
             System.out.print(UniqueArray[i] + " ");
         }
     }
}
