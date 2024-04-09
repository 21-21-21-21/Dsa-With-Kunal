package ArrayList;

import  java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //at the time of creation it's gonna be like this -> []

        //let's add three list inside the list.
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //now it's look like -> [ [], [], [] ]

        //now add elements.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
