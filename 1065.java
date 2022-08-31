import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    static int testNumIdx = sc.nextInt();
    static boolean[] testNumBooleanArr = new boolean[testNumIdx + 1];

    // boolean형 출력 메서드
    static void booleanArrPrint() {
        int booleanCnt = 0;
        for (int i = 1; i < testNumBooleanArr.length; i++) {
            if (testNumBooleanArr[i]) {
                ++booleanCnt;
            }
        }
        System.out.println(booleanCnt);
    }

    static void AP(int testNumIdx) {

        String testNumIdxStr = String.valueOf(testNumIdx);

        if (testNumIdxStr.length() <= 2) {
            testNumBooleanArr[testNumIdx] = true;
            return;
        }

        if (testNumIdxStr.length() > 3) {
            testNumBooleanArr[testNumIdx] = false;
            return;
        }

        // 받은 testNumIdx를 자르기 위한 준비
        String testNumStr = String.valueOf(testNumIdx);
        String[] testNumArr = testNumStr.split("");

        // int형으로 자릿수 나눠서 넣음
        int[] testNumIntArr = new int[testNumArr.length];
        for (int i = 0; i < testNumArr.length; i++) {
            testNumIntArr[i] = Integer.parseInt(testNumArr[i]);
        }

        // 크기가 2 이상일 때 등차수열 검증
        int temp = testNumIntArr[1] - testNumIntArr[0];
        if (temp == testNumIntArr[2] - testNumIntArr[1]) {
            testNumBooleanArr[testNumIdx] = true;
        }
    }

    public static void main(String[] args) {
        for (int i = testNumIdx; i > 0; i--) {
            AP(i);
        }
        booleanArrPrint();
    }
}
