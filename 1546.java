/*
problem
Sejun screwed up his final exam. Sejun decided to manipulate the score and take it home. First of all, 
Sejun chose the maximum value among his scores. This value is called M. Then, all scores were corrected to the score/M*100.

For example, if Sejun's highest point is 70 and the math score is 50, the math score becomes 50/70*100, resulting in 71.43 points.

When Sejun's grades are newly calculated in the above way, write a program to find a new average.

Input
The first line is given N, the number of subjects taken the test. This value is less than or equal to 1000.
Sejun's current performance will be given to the second row. This value is a non-negative integer less than or equal to 100,
and at least one value is greater than zero.

Output
Output a new mean in the first line. If the absolute error or relative error between 
the actual correct answer and the output value is 10^2 or less, it is the correct answer.
*/

import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = Integer.parseInt(sc.nextLine());
        if (subject > 0 && subject <= 1000) {
            int[] arr = new int[subject];
            for (int i = 0; i < arr.length; i++) {
                int score = Integer.parseInt(sc.nextLine());
                if (score >= 0 && score <= 100) {
                    arr[i] = score;
                }
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] / (max * 100);
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int avg = sum / arr.length;
            System.out.println(avg);
        }
    }
}
