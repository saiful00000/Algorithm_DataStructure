package SortingAlgorithms;

public class Quick_Sort_2019 {

    public void quickSort(int arr[]){

        // calling our main quickSort function
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int left, int right) {

        // while left<right we have to continue out partitioning
        if (left < right){

            int actualPositionOfPivot = partition(arr, left, right);

            // now we have to do partitioning for left side elements of pivot and
            // right side elements of pivot
            quickSort(arr, left, actualPositionOfPivot-1);
            quickSort(arr, actualPositionOfPivot+1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {

        // here we use last element of given range as pivot
        int pivot = arr[right];

        // we need a pointer to point last swap index
        int i = left - 1;

        // this loop is for scanning element from left to right
        for (int j = left; j < right; j++) {

            // if arr[j] is less than the pivot we swap arr[j] with arr[i+1]
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, right);

        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
