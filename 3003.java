import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chessWhiteNum = { 1, 1, 2, 2, 2, 8 };
		int[] chessWhiteFindNum = new int[6];
		int[] findPiece = new int[6];

		for (int i = 0; i < chessWhiteFindNum.length; i++) {
			chessWhiteFindNum[i] = sc.nextInt();
			findPiece[i] = chessWhiteNum[i] - chessWhiteFindNum[i];
		}
		
		for (int i = 0; i < findPiece.length; i++) {
			System.out.println(findPiece[i]);
		}

		sc.close();
	}
}
