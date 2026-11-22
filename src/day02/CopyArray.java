package day02;


import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        // Wrong way
        int[] b = a;

        b[0] = 99;

        System.out.println("Original A: " + Arrays.toString(a));
        System.out.println("Reference B: " + Arrays.toString(b));


        // Correct way using for loop
        int[] x = {1, 2, 3};

        int[] y = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }

        y[0] = 99;

        System.out.println("Original X: " + Arrays.toString(x));
        System.out.println("Copied Y: " + Arrays.toString(y));


        // Using Arrays.copyOf
        int[] p = {1, 2, 3};

        int[] q = Arrays.copyOf(p, p.length);

        // Using clone
        int[] r = p.clone();

        System.out.println("copyOf: " + Arrays.toString(q));
        System.out.println("clone: " + Arrays.toString(r));
    }
}

