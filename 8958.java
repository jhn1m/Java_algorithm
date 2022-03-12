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
