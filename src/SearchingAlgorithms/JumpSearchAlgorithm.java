package SearchingAlgorithms;

public class JumpSearchAlgorithm {

    public int jumpSearch(int[] array, int value) {
        int n = array.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (array[Math.min(step, n) - 1] < value) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (array[prev] < value) {
            prev++;
            if (prev == Math.min(n, step)) {
                return -1;
            }
        }

        if (array[prev] == value) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        JumpSearchAlgorithm search = new JumpSearchAlgorithm();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 7;
        int index = search.jumpSearch(array, value);

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index "+ index);
        }
    }
}
