import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        BigInteger forCalc;

        String forCalcString = "";
        int forSum = 0;
        cnt = sc.nextInt();

        if (cnt >= 1 && cnt <= 100) {
            forCalc = sc.nextBigInteger();
            forCalcString = String.valueOf(forCalc);
            String[] forCalcArr = new String[forCalcString.length()];
            int[] forCalcIntArr = new int[forCalcString.length()];

            for (int i = 0; i < forCalcArr.length; i++) {
                if (i == forCalcArr.length) {
                    forCalcArr[i] = forCalcString.substring(i);
                    forCalcIntArr[i] = Integer.parseInt(forCalcArr[i]);
                } else {
                    forCalcArr[i] = forCalcString.substring(i, i + 1);
                    forCalcIntArr[i] = Integer.parseInt(forCalcArr[i]);
                }
            }

            for (int i = 0; i < forCalcIntArr.length; i++) {
                forSum += forCalcIntArr[i];
            }

            System.out.println(forSum);

        }
    }
}
