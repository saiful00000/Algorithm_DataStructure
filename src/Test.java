import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
