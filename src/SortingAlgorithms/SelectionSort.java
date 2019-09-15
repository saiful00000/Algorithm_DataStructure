package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] array) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            int index = i;
            for (int j = i; j < len; j++)
                if (array[j] < array[index]) {
                    int temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                }
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }


}
