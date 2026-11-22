package day02;

public class EvenOddCounter {
    public static void main(String[] args){
        int[] arr = {12, 5, 8, 20, 3 , 10 , 90 , 9 , -1};
        int even = 0 , odd = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else if (arr[i] !=0 ){
                odd++;
            }


        }System.out.println("Even = " + even + ", Odd = " + odd);
    }
}
