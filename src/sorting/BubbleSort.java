package sorting;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int n = a.length;

        int result = 0;

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;

            for (int i = 0; i < n - 1; i++){
                if (a[i] > a[i+1]){
                    swap(a, i, i+1);
                    isSorted = false;
                    result++;
                    System.out.println(result);
                    break;
                }
            }
        }


        System.out.println("Array is sorted in " + Integer.toString(result)  + " swaps.");
        System.out.println("First Element: " + Integer.toString(a[0]));
        System.out.println("Last Element: " + Integer.toString(a[n-1]));
    }

    static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
