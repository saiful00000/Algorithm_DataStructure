package DivideAndConquer;

public class Search_Element_In_Circular_Sorted_Array {

    public static int searchElement(int[] array, int key) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == array[mid])
                return mid;
            if (array[mid] <= array[end]) {
                if (key > array[mid] && key <= array[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (key >= array[start] && key <= array[mid])
                    end = mid - 1;
                else
                    start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int key = 5;
        int result = searchElement(array, key);

        if (result != -1)
            System.out.println("Value found at index : "+ result);
        else
            System.out.println("Value not found.");
    }
}
