import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static void goldBach(int x) {
        Map<Object, Object> map = new LinkedHashMap<>();

        // 배열 생성 후 최솟값 세팅
        int[] arr = new int[x + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        // 소수 검증
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }

            for (int j = 2 * i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        // 소수 값을 map에 담은 후 goldBach2 메서드에서 후 처리
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                map.put(i, i);
            }
        }
        int[] arrInt = goldBach2(map);

        goldBach3(x, arrInt);
    }

    // map 값을 가지고 가공
    static int[] goldBach2(Map<Object, Object> map) {
        // linkedHashMap으로 받은 map을 배열로 변환
        Object[] arr = new Object[map.size()];
        arr = map.values().toArray();

        // object형을 다시 int형으로 변환 후 goldBach3 메서드에서 배열 처리
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = (int) arr[i];
        }
        return arrInt;
    }

    static void goldBach3(int x, int[] arrInt) {
        int firstVal = 0;
        int secondVal = 0;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = i; j < arrInt.length; j++) {
                if (arrInt[i] + arrInt[j] == x) {
                    firstVal = arrInt[i];
                    secondVal = arrInt[j];
                }
            }
        }
        System.out.println(firstVal + " " + secondVal);
    }

    public static void main(String[] args) {
        // 입력받는 부분
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = 0;
            x = sc.nextInt();
            goldBach(x);
        }
    }
}
