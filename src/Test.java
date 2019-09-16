import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int bojackPoint = 0;
        int peanutbutterPoint = 0;

        M++;
        while (M < N) {
            if (M % 3 == 0) {
                bojackPoint++;
            }
            if (M % 7 == 0) {
                peanutbutterPoint += 2;
            }
            M++;
        }

        if (bojackPoint > peanutbutterPoint) {
            System.out.println("BoJack Rocks !!!");
        } else if (peanutbutterPoint > bojackPoint) {
            System.out.println("Mr. PeanutButter Rules !!!");
        } else {
            System.out.println("DRAW !!!");
        }
    }
}
