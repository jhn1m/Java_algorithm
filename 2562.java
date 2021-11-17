/*
Given nine different natural numbers, write a program to find the maximum of them and how many times they are.

For example, nine different natural numbers.

3, 29, 38, 12, 57, 74, 40, 85, 61

Given this, the maximum of these is 85, which is the eighth number.

Input
From the first line to the ninth line, one natural number is given per line. The given natural number is less than 100.

Output
The maximum value is output on the first line, and the maximum value is output on the second line.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
