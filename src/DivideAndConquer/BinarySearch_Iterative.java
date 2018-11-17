package DivideAndConquer;

public class BinarySearch_Iterative {

    public static int binarySearch(int[] nums, int number) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (number == nums[mid])
                return mid;
            else if (number < nums[mid])
                end = mid - 1;
            else
                start = mid +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchValue = 100;
        int result = binarySearch(nums, searchValue);

        if (result != -1) {
            System.out.println("Value found at index " + result);
        } else {
            System.out.println("Value not found.");
        }
    }
}
