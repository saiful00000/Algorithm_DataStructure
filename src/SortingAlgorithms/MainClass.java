package SortingAlgorithms;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] arg){
        Quick_Sort_2019 quickSort = new Quick_Sort_2019();

        int[] arr = {9,5,8,4,7,3,6,2,1};

        quickSort.quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
