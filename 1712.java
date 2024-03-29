/**
@version 1.0 11달 전 작성
*/
/*
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int All = 0;
        int A = sc.nextInt(); // 고정비용
        int B = sc.nextInt(); // 가변 비용
        int C = sc.nextInt(); // 책정된 가격
        int i = 1;
        if (A <= 2100000000 && B <= 2100000000 && C <= 2100000000) {
            while (All < C) {
                B = B * i;
                C = C * i;
                All = A + B;
                i++;
            }
            System.out.print(i);
        }
    }
}
*/

import java.util.Scanner;

class Main {

    static void breakPoint(Long a, Long b, Long c) {
        if (c <= b) {
            System.out.println(-1);
        } else {
            System.out.print((a / (c - b)) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();

        breakPoint(a, b, c);
    }
}
