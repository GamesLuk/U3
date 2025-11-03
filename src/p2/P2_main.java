package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

public class P2_main {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;


        a = RandomGenerator.getDefault().nextInt(0, 20);
        b = RandomGenerator.getDefault().nextInt(0, 20);
        c = RandomGenerator.getDefault().nextInt(0, 20);
        d = RandomGenerator.getDefault().nextInt(0, 20);


        d = 0;
        System.out.println(a + " " + b + " " + c + " " + d);

        d += a == b ? 1 : 0;
        d += a == b || a == c ? 1 : 0;
        d += a + b >= c ? 1 : 0;
        d += a + b + c >= 100 ? 1 : 0;

        System.out.println(d);

    }

}
