import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test {

    public static int circularArraySearch(int[] A, int x) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (x == A[mid]) {
                return mid;
            }
            if (A[mid] <= A[right]) {
                if (x > A[mid] && x <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (x >= A[left] && x < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int a = 0, b = a;
        a = 10;
        System.out.println(a);
        System.out.println(b);
    }
}
