import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CroatiaWord = sc.next();

        CroatiaWord = CroatiaWord.toLowerCase();

        CroatiaWord = CroatiaWord.replace("c=", "@");
        CroatiaWord = CroatiaWord.replace("c-", "@");
        CroatiaWord = CroatiaWord.replace("dz=", "@");
        CroatiaWord = CroatiaWord.replace("d-", "@");
        CroatiaWord = CroatiaWord.replace("lj", "@");
        CroatiaWord = CroatiaWord.replace("nj", "@");
        CroatiaWord = CroatiaWord.replace("s=", "@");
        CroatiaWord = CroatiaWord.replace("z=", "@");

        System.out.println(CroatiaWord.length());
    }
}
