
/*package whatever //do not write package name here */

import java.io.*;
import java.util.Arrays;

class Depth {

    private static int computeDepth(int n) {

        boolean[] digits = new boolean[10];
        int multiplier = 1;
        int digitCount = 0;

        while (true) {
            int result = n * multiplier;

            while (result != 0) {
                int digit = result % 10;

                if (!digits[digit]) {
                    digits[digit] = true;
                    digitCount++;
                }
                result = result / 10;
            }

            if (digitCount >= 10)
                break;
            multiplier++;
        }

        return multiplier;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(computeDepth(25));
    }
}