package day01;
import java.util.Scanner;

public class AverageOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter number" + " " + (i + 1) + " " + ":");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            avg = sum / arr.length;

        }System.out.println("Sum:" + " " + sum);
        System.out.println("Average" + " " +avg);
    }
}
