
import java.util.Scanner;
2
​
3
class Main {
4
​
5
    static Scanner sc = new Scanner(System.in);
6
​
7
    static double[] students(int c) {
8
        double[] arr = new double[c];
9
        for (int i = 0; i < c; i++) {
10
            int n = sc.nextInt();
11
            int[] scores = new int[n];
12
​
13
            double avg = 0;
14
            double avgUpCnt = 0;
15
            double avgStudentPercent = 0;
16
            double studentCnt = scores.length;
17
            for (int j = 0; j < scores.length; j++) {
18
                scores[j] = sc.nextInt();
19
                avg += scores[j];
20
            }
21
​
22
            avg /= studentCnt;
23
​
24
            for (int k = 0; k < scores.length; k++) {
25
                if (scores[k] > avg) {
26
                    ++avgUpCnt;
27
                }
28
            }
29
            avgStudentPercent = ((avgUpCnt / studentCnt) * 100);
30
            arr[i] = avgStudentPercent;
31
        }
32
        return arr;
33
    }
34
​
35
    public static void main(String[] args) {
36
​
37
        int c = sc.nextInt();
38
        double[] arrResult = students(c);
39
​
40
        for (int i = 0; i < arrResult.length; i++) {
41
            System.out.println(String.format("%.3f", arrResult[i]) + "%");
42
        }
43
    }
44
}
