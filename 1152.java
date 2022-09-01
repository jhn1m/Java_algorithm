import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();
        words = words.trim();

        String[] wordsArr = words.split(" ");

        if (wordsArr[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(wordsArr.length);
        }

    }
}
