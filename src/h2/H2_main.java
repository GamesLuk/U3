package h2;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class H2_main {

    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        int k = 3;
        int min;
        int max;

        /*
		i = RandomGenerator.getDefault().nextInt(-20, 20);
        j = RandomGenerator.getDefault().nextInt(-20, 20);
        k = RandomGenerator.getDefault().nextInt(-20, 20);
		*/

        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(j);
        list.add(k);

        System.out.println(list.toString());

        list.sort(Integer::compareTo);

        System.out.println(list.toString());

        min = list.getFirst();
        max = list.getLast();

        System.out.println(min);
        System.out.println(max);

    }

}
