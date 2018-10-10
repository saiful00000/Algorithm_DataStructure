package DivideAndConquer;

public class FindPeackElement {

    static int findPeakElemntIndex(int[] array, int low, int high, int n) {
        int mid = low + (high - low) /2;

        if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1) || array[mid + 1] <= array[mid]) {
            return mid;
        }else if (mid > 0 && array[mid - 1] > array[mid]) {
            return findPeakElemntIndex(array, low, (mid - 1), n);
        } else {
            return findPeakElemntIndex(array, (mid+1), high, n);
        }
    }

    static int findPeak(int[] array, int n) {
        return findPeakElemntIndex(array, 0, (n-1), n);
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 0, 1, 8, 3, 4};

        int result = findPeak(array, array.length);
        System.out.println("The index of an peak element is : "+ result);
        System.out.println("The peak elemnt is              : "+ array[result]);
    }
}
