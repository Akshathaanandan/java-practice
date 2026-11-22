package day02;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {12, 5, 8, 20, 3};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }else if(arr[i]>second_largest && arr[i] !=largest){
                second_largest = arr[i];
            }
        }System.out.println("Second largest = " + second_largest);
    }
}
