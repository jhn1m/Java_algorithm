/*
There are results of OX quizzes such as "OOXXXXOO". O is the correct answer, and X is the wrong answer. When a problem is encountered, the score of the problem is the number of consecutive Os to that problem. For example, the score in question 10 is 3.

The score of "OOXXXXOOO" is 1+2+0+0+1+0+0+0+1+2+3 = 10.

Given the result of the OX quiz, write a program to get a score.

Input
The first row is given the number of test cases. Each test case consists of a single line, with strings greater than 0 and less than 80. The string consists of only O and X.

Output
A score is output for each test case.

"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        int Ocnt = 0;
        int Xcnt = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("O")) {
                Ocnt++;
            } else {
                result += Ocnt;
                Ocnt = 0;
            }
        }
    }
}

/* 22_01_04
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();
        String[] arr = new String[caseCnt];
        int OCnt = 0;
        int OSum = 0;
        int ORes = 0;

        for (int i = 0; i < caseCnt; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < caseCnt; i++) {
            for (int j = 0; i < arr[i].length(); j++) {
                if (arr[i].substring(j).equals("O")) {
                    while (true) {
                        OCnt += 1;
                        OSum += OCnt;
                        ORes = OSum;
                    }
                } else {
                    OCnt = 0;
                    OSum = 0;
                }
            }
            System.out.println(ORes);
        }
    }
}

*/

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Arr = new String[sc.nextInt()];
        String[] Arr2;
        sc.close();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.next();

        }

    }

    void makeOX() {
        // 각 문자열의 크기
        int targetLength = (int) (Math.random() * 10);
        Random rd = new Random();
        // 아스키 코드를 이용하여 랜덤으로 문자추출
        int O = 65;
        int X = 66;
        StringBuilder sb = new StringBuilder(targetLength);
        for (int i = 0; i < targetLength; i++) {
            int randomLimitedInt = O + (int) (rd.nextFloat() * (X - O + 1));
            sb.append((char) randomLimitedInt);
        }

        // 추출된 문자를 치환하기
        String generatedString = sb.toString();
        generatedString = generatedString.replace("A", "O");
        generatedString = generatedString.replace("B", "X");
        System.out.println(generatedString);
    }
*/
