package p3;

import java.util.random.RandomGenerator;

public class P3_main {

    public static void main(String[] args) {

        print(5);
        squareAndPrint(5);
        checkEvenAndPrint(5);

    }

    private static void print(int n) {
        if (n < 0) {
            n *= -1;
        }
        System.out.println(n);
    }

    private static void squareAndPrint(int n) {
        System.out.println(n * n);
    }

    private static void checkEvenAndPrint(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
