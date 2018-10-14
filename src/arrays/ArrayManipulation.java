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
        int[] finalArray = new int[n];

        for (int[] query : queries) {

            for (int i = query[0]; i < query[1] + 1; i++) {
                int addedVal = query[2];
                print(query);
                finalArray[i-1] += addedVal;
            }
        }

        int largest = 0;
        for (int i : finalArray){
            if (i > largest) largest = i;
        }

        return largest;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(Integer.toString(i) + " ");
        }
        System.out.println();
    }
}
