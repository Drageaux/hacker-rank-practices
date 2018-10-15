package arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        // queries[index][0] = first number
        // queries[index][1] = second number
        // queries[index][1] = added value
        int[] finalArray = new int[n + 1];
        int largest = 0;

        for (int[] query : queries) {

            int addedVal = query[2];
            int startInd = query[0];
            int endInd = query[1];

            finalArray[startInd-1] += addedVal;
            finalArray[endInd] -=addedVal;
        }
        long max=0;
        long temp=0;

        for(int i=0;i<n;i++){
            temp += finalArray[i];
            if(temp> max) max=temp;
        }
        return max;

    }

    // static void print(int[] arr) {
    //     for (int i : arr) {
    //         System.out.print(Integer.toString(i) + " ");
    //     }
    //     System.out.println();
    // }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(Integer.toString(i) + " ");
        }
        System.out.println();
    }
}
