package DivideAndConquer;

public class BinarySearch_Recursive {

    public static int binarySearch(int[] nums,int number, int start, int end) {
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (number == nums[mid])
            return mid;
        else if (number < nums[mid])
            return binarySearch(nums, number, start, mid - 1);
        else
            return binarySearch(nums, number, mid + 1, end);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchValue = 11;
        int result = binarySearch(nums, searchValue, 0, nums.length-1);
        if (result != -1)
            System.out.println("Value found at index : "+ result);
        else
            System.out.println("Value not found.");
    }
}
