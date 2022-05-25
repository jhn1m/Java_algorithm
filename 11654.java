import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        char stringToChar = inputString.charAt(0);
        int charToInt = (int) stringToChar;

        sc.close();

        System.out.println(charToInt);

    }
}
