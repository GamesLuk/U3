package p1;

import java.util.random.RandomGenerator;

public class P1_main {

    public static void main(String[] args) {

        int wuerfel = 1;

        wuerfel = RandomGenerator.getDefault().nextInt(1, 6);

        System.out.println(wuerfel);

        switch (wuerfel) {
            case 1:
            case 4:
                System.out.println("Gewonnen!");
                break;
            case 2:
                System.out.println("Verloren!");
                break;
            case 5:
                System.out.println("Nochmal wuerfeln!");
                break;
        }

    }

}