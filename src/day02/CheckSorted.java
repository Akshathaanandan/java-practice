package day02;


public class CheckSorted {

    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isSorted(new int[]{1, 2, 3, 4}));

        System.out.println(isSorted(new int[]{1, 3, 2, 4}));

        System.out.println(isSorted(new int[]{1, 2, 2, 3}));

        System.out.println(isSorted(new int[]{5}));

        System.out.println(isSorted(new int[]{5, 41}));

    }
}
