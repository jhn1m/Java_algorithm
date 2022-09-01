import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabets = new int[26];
        String word = sc.next();
        word = word.toUpperCase();
        String[] wordArr = word.split("");

        Arrays.sort(wordArr);

        for (int i = 0; i < wordArr.length; i++) {
            int wordIdx = wordArr[i].charAt(0) - 65;
            alphabets[wordIdx]++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                result = (char) (i + 65);
            } else if (alphabets[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
