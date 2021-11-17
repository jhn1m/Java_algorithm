/*
problem
Given three natural numbers A, B, and C, write a program
to find out how many times each number from 0 to 9 was written in the result of calculating A × B × C.

For example, if A = 150, B = 266, and C = 427, A × B × C = 150 × 266 × 427 = 17037300, and
as a result of calculation, 0 was used three times, 1 was used one time, 3 was used two times, and 7 was used two times.

Input
A is given in the first line, B in the second line, and C in the third line.
A, B, and C are all natural numbers greater than or equal to 100 and less than 1,000.

Output
The first line outputs how many times 0 has been written in the result of A × B × C. 
Similarly, from the second line to the tenth line, we print out how many times the numbers
from 1 to 9 were written in the results of A × B × C, one per line.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr;
        int intResult;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if ((a >= 100 && a < 1000) && (b >= 100 && b < 1000) && (c >= 100 && c < 1000)) {
            intResult = a * b * c;
            String strResult = String.valueOf(intResult);
            arr = strResult.split("");
            int[] arr2 = new int[10];
            Arrays.fill(arr2, 0);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("0")) {
                    arr2[0]++;
                } else if (arr[i].equals("1")) {
                    arr2[1]++;
                } else if (arr[i].equals("2")) {
                    arr2[2]++;
                } else if (arr[i].equals("3")) {
                    arr2[3]++;
                } else if (arr[i].equals("4")) {
                    arr2[4]++;
                } else if (arr[i].equals("5")) {
                    arr2[5]++;
                } else if (arr[i].equals("6")) {
                    arr2[6]++;
                } else if (arr[i].equals("7")) {
                    arr2[7]++;
                } else if (arr[i].equals("8")) {
                    arr2[8]++;
                } else if (arr[i].equals("9")) {
                    arr2[9]++;
                }
            }
            for (int i = 0; i <= 9; i++) {
                System.out.println(arr2[i]);
            }
        }
    }
}
