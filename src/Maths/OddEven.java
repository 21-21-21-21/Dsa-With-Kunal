package Maths;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number = 62;

        if ((number & 1) == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
