package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSOrt {

    public void bubbleSOrt(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-1-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSOrt sort = new BubbleSOrt();

        int[] array = {9,8,7,6,5,4,3,2,1};
        sort.bubbleSOrt(array);

        System.out.println(Arrays.toString(array));
    }

}
