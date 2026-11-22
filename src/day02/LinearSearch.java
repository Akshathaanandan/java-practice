package day02;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {12,5,8,20,3};
        int result =linearSearch(arr,20);
        if(result == -1){
            System.out.println("not found");
        } else{
            System.out.println("Target Found at index:" + " " + result);
        }

    }
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;

    }
}
