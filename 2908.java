import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstAns = sc.nextInt();
        int secondAns = sc.nextInt();

        String firstAnsStr = String.valueOf(firstAns);
        String secondAnsStr = String.valueOf(secondAns);

        String[] firstAnsArr = firstAnsStr.split("");
        String[] secondAnsArr = secondAnsStr.split("");

        for (int i = 0, j = firstAnsArr.length - 1; j > i; i++, j--) {
            String temp = firstAnsArr[j];
            firstAnsArr[j] = firstAnsArr[i];
            firstAnsArr[i] = temp;
        }

        for (int i = 0, j = secondAnsArr.length - 1; j > i; i++, j--) {
            String temp = secondAnsArr[j];
            secondAnsArr[j] = secondAnsArr[i];
            secondAnsArr[i] = temp;
        }

        String ReversedFirstAnswer = "";
        for (String i : firstAnsArr) {
            ReversedFirstAnswer += i;
        }

        String ReversedSecondAnswer = "";
        for (String i : secondAnsArr) {
            ReversedSecondAnswer += i;
        }

        int ReversedFirstAnswerInt = Integer.parseInt(ReversedFirstAnswer);
        int ReversedSecondAnswerInt = Integer.parseInt(ReversedSecondAnswer);

        if (ReversedFirstAnswerInt > ReversedSecondAnswerInt) {
            System.out.println(ReversedFirstAnswerInt);
        } else {
            System.out.println(ReversedSecondAnswerInt);
        }

    }
}
