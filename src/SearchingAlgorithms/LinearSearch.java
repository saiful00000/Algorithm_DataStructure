package SearchingAlgorithms;

/*
* In Linear Search algorithm we start from leftmost element of array A[0]
* and check every elemet from left to right if we find the element then
* we return index number
* */

public class LinearSearch {

    public int linearSearch(int[] array, int val) {
        if (array.length == 0)
            return -1;

        for (int i = 0; i < array.length; i++) {
            if (val == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();

        int[] array = {1, 3, 5, 8, 9, 5, 3};
        int val = 8;

        int index = search.linearSearch(array, val);

        if (index == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Value found at index " + index);
        }
    }

}
