package day01;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            System.out.print("Enter the numbers:");
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }

        }System.out.println("Maximum Element is :" + " " + max);
    }


}
