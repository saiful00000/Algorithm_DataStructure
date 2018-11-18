/*
* Given a circular array of integres, find the number of times the array rotate.
* Assume there are no duplicates in the array and the rottation is anti clockwise direction.
*
* Example :
*           input  : array = {8 , 9 , 10, 2, 5, 6};
*           output : the number of rottation is 3
* */


package DivideAndConquer;

public class NumberOfRottation_In_Sorted_Array {

    public static int countRottation(int[] array) {
        if (array.length == 0)
            return -1;

        int start = 0;
        int end   = array.length - 1;

        while (array[start] > array[end]) {
            int mid = ( start + end ) / 2;
            if (array[mid] > array[end])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] array = {8 , 9 , 10, 2, 5, 6};
        System.out.println(countRottation(array));
    }
}
