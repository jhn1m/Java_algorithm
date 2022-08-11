import java.util.Scanner;

class Main {

    static int scoreOutput(String OX) {
        String[] OXArr = OX.split("");
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < OXArr.length; i++) {
            if (OXArr[i].equals("O")) {
                ++cnt;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        int[] arrResult = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            arrResult[i] = scoreOutput(arr[i]);
        }

        for (int i = 0; i < arrResult.length; i++) {
            System.out.println(arrResult[i]);
        }
    }
}

/*
import java.util.Scanner;

class Main {

    static Scanner sc = new Scanner(System.in);
    static int testCaseNum = 0;
    static int testCaseScore = 0;
    static String testCaseString = "";
    static String testCaseChar = "";
    static int finalScore = 0;

    static void makeTestCase(int testCaseNum) {
        int[] testCaseScores = new int[testCaseNum];
        for (int i = 0; i < testCaseNum; i++) {
            testCaseString = sc.next();
            if ((testCaseString.length() > 0 && testCaseString.length() < 80)
                    && (testCaseString.equals("X") || testCaseString.equals("O"))) {
                validationTestCase(testCaseString);
                testCaseScores[i] = testCaseScore;
            }
        }

        for (int j = 0; j < testCaseScores.length; j++) {
            System.out.println(testCaseScores[j]);
        }

    }

    static int validationTestCase(String testCaseString) {
        testCaseScore = 0;
        for (int i = 0; i < testCaseString.length(); i++) {
            testCaseChar = "";
            if (i - 1 == testCaseString.length()) {
                testCaseChar = testCaseString.substring(testCaseString.length() - 1, testCaseString.length());
                validationTestCase2(testCaseChar);
            } else {
                testCaseChar = testCaseString.substring(i, i + 1);
                validationTestCase2(testCaseChar);
            }
        }
        testCaseScore = finalScore;
        return testCaseScore;
    }

    static int validationTestCase2(String testCaseChar) {
        int scoreCnt = 0;

        for (int i = 0; i < testCaseString.length(); i++) {

            if (testCaseChar.equals("X")) {
                scoreCnt = 0;
            } else {
                ++scoreCnt;
                finalScore += scoreCnt;
            }
        }
        return finalScore;
    }

    public static void main(String[] args) {
        testCaseNum = sc.nextInt();
        makeTestCase(testCaseNum);

    }
}
*/
