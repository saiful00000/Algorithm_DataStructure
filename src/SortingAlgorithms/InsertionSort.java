package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] array) {
        int len = array.length;

        for (int i = 1; i < len; i++) {
            int currentVal = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentVal) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentVal;
        }
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort.insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

}
