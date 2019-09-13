package SearchingAlgorithms;

public class TernarySearchAlgorithm {

    public int ternarySearch(int[] array,int left, int right, int value) {
        if (right >= left) {
            int m1 = left + (right - left) / 3;
            int m2 = m1 + (right - left) / 3;

            if (array[m1] == value) return m1;
            if (array[m2] == value) return m2;
            if (array[m1] > value)
                return ternarySearch(array, left, m1-1, value);
            if (array[m2] < value)
                return ternarySearch(array, m2+1, right, value);

            return ternarySearch(array, m1 + 1, m2 - 1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        TernarySearchAlgorithm search = new TernarySearchAlgorithm();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int index = search.ternarySearch(array, 0, array.length-1, value);

        if (index == -1) {
            System.out.println("Value not found.");
        }else {
            System.out.println("Value found at index "+ index);
        }
    }

}
