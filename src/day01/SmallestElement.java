package day01;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
        }System.out.println("Smallest number is : " + " " + min);
    }
}
