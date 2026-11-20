package day01;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("How many numbers:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i < arr.length; i++){
           System.out.print("Enter number" + " " + (i +1) + " " + ":");
           arr[i] = sc.nextInt();
       }
       System.out.println(java.util.Arrays.toString(arr));

    }
}
