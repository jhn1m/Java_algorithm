/*
problem
When there are two natural numbers A and B, A%B is the remainder of A divided by B. For example, the remainder obtained by dividing 7, 14, 27, and 38 by 3 is 1, 2, 0, 2. 

After receiving 10 inputs, the remainder divided by 42 is obtained. Then write a program that outputs how many different values there are.

Input
Numbers from the first line to the tenth line are given one per line. This number is less than or equal to 1,000 and is a nonnegative integer.

Output
In the first line, when divided by 42, output how many different remainings are.
*/

import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a <= 1000 && a > 0) {
                arr[i] = a;
            }
        }
        sc.close();

        for (int i = 0; i < 10; i++) {
            arr[i] %= 42;
        }
        Arrays.sort(arr);

        int cnt2 = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr[i + 1]) {
                cnt2++;
            }
        }
        System.out.println(cnt2 + 1);
    }
}
