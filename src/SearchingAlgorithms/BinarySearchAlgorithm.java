package SearchingAlgorithms;

/*To perform binary search the array should be sorted
*
* first of all we check the mid element of array with the given value
* and then if its match then we return mid index and if given element
* is bigger than mid element then we search again in the left array and else
* we search left array until element was found or element not exist in the array
* */

public class BinarySearchAlgorithm {

    // iterative implementation
    public int bunarySearch(int[] array,int left, int right, int value) {
        if (array.length == 0)
            return -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (value == array[mid]) {
                return mid;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchAlgorithm search = new BinarySearchAlgorithm();

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value  = 22;
        int index = search.bunarySearch(array, 0, array.length - 1, value);

        if (index == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Value found at index "+ index);
        }

    }

}
