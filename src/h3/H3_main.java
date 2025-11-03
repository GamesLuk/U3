package h3;

import java.util.random.RandomGenerator;

public class H3_main {

    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        int k = -10;

		/*
		i = RandomGenerator.getDefault().nextInt(-20, 20);
        j = RandomGenerator.getDefault().nextInt(-20, 20);
		*/

        System.out.println(i + " " + j);

        boolean expr1 = i > j;
        boolean expr2 = i > 200;
        boolean expr3 = j > 100;

        System.out.println(expr1);
        System.out.println(expr2);
        System.out.println(expr3);

        if (expr1 && !expr2 && !expr3) {
            k = 1;
        } else if (expr1 && expr2 && !expr3) {
            k = 2;
        } else if (expr1 && expr2 && expr3) {
            k = 3;
        } else if (!expr1 && !expr2 && !expr3) {
            k = 4;
        }

        System.out.println(k);

    }

}
