import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();
        alphabet = alphabet.toLowerCase();
        String[] alphabetArr = alphabet.split("");
        String[] alphabets = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z"
        };

        int[] alphabetsLocation = {
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1,
                -1
        };

        for (int i = 0; i < alphabetArr.length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (alphabetArr[i].equals(alphabets[j])) {
                    if (alphabetsLocation[j] == -1) {
                        alphabetsLocation[j] = i;
                    }
                }
            }
        }

        for (int i = 0; i < alphabetsLocation.length; i++) {
            System.out.print(alphabetsLocation[i] + " ");
        }
    }
}
