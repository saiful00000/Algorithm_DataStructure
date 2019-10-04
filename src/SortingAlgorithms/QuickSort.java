package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

    public int partition(int array[], int low, int high) {
        int pivot = array[high ];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);

            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort.quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));
    }

}
