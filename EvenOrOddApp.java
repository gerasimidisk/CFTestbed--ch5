package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOrOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.println("Please insert a number");
        a = in.nextInt();
        if (isEven(a)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    /**
     * Evaluates a number if is odd.
     *
     * @param a     the input number.
     * @return      true, if is odd, false otherwise.
     */

    public static boolean isOdd(int a) {
        return (a % 2) != 0;
    }

    /**
     * Evaluates a number if is even.
     *
     * @param a     the input number.
     * @return      true, if is even, false otherwise.
     */

    public static boolean isEven(int a) {
        return !isOdd(a);
        }
    }




