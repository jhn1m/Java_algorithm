import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phoneStr = sc.next();
        String[] phoneStrArr = phoneStr.split("");
        int result = 0;
        for (int i = 0; i < phoneStrArr.length; i++) {
            int dial = 0;
            switch (phoneStrArr[i]) {
                case "A":
                case "B":
                case "C":
                    dial = 2;
                    break;
                case "D":
                case "E":
                case "F":
                    dial = 3;
                    break;
                case "G":
                case "H":
                case "I":
                    dial = 4;
                    break;
                case "J":
                case "K":
                case "L":
                    dial = 5;
                    break;
                case "M":
                case "N":
                case "O":
                    dial = 6;
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    dial = 7;
                    break;
                case "T":
                case "U":
                case "V":
                    dial = 8;
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    dial = 9;
                    break;
                default:
                    break;
            }
            result += dial;
        }
        result += phoneStrArr.length;
        System.out.println(result);
    }
}
