package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * DIFFICULTY: EASY
 */
public class LeftRotation {


    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int rotatedIndex = i - d;
            int actualIndex = a.length + rotatedIndex;
            if (actualIndex > a.length - 1) {
                actualIndex -= a.length;
            }

            System.out.print(actualIndex);
            System.out.println(i);
            b[actualIndex] = a[i];


        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.print(Integer.toString(a[i]) + " ");
        }
        System.out.println("");

        int[] b = rotLeft(a, 4);
        for (int i = 0; i < b.length; i++) {
            System.out.print(Integer.toString(b[i]) + " ");
        }
    }

}