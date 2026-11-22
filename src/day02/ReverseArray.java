package day02;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {12, 5, 8, 20, 3};
        int[] reverse = new int[arr.length];
        int j = 0;
        System.out.println("Orginal array :" + Arrays.toString(arr));
        for (int i = arr.length-1; i>=0; i--){
            reverse[j] = arr[i];
            j++;

        }System.out.println("reversed array :" + Arrays.toString(reverse));
    }
}
