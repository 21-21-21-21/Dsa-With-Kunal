package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>(5);
//        list.add(21);
//        list.add(1);
//        list.add(99);
//        list.add(81);
//        list.add(222);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

//        System.out.println(list);
//       // System.out.println(list.contains(21));
//        list.set(1, 777);
//        list.remove(2);
//        System.out.println(list);

        //Take input in ArrayList.
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
