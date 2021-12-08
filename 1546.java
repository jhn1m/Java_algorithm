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
/*
문제
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 (점수 / M * 100)으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 (50 / 70*100)이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

출력
첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        if (subject > 0 && subject <= 1000) {
            int[] arr = new int[subject];
            for (int i = 0; i < arr.length; i++) {
                int score = sc.nextInt();
                if (score >= 0 && score <= 100) {
                    arr[i] = score;
                }
                int zeroCnt = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == 0) {
                        zeroCnt++;
                    }
                }
                if (zeroCnt > 1) {
                    System.out.println("다시 입력하시오");
                    break;
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
