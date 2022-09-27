import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Map<Object, Object> map = new LinkedHashMap<Object, Object>();

    // 배열내의 값을 소수체크 함수에 대입
    static int arrChk(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNum(arr[i])) {
                cnt++;
            }
        }
        return cnt;
    }

    // 소수 체크
    static boolean isPrimeNum(int n) {
        // 1은 소수가 아니므로 제외하고 시작
        if (n > 1) {
            int cnt = 0;

            // 1부터 시작하여 자신까지 나머지 연산실행
            for (int i = 1; i <= n; i++) {
                // 소수를 찾기 위한 나머지 연산
                if (n % i == 0) {
                    cnt++;
                }
            }

            // 소수는 1과 자신으로만 나눠지므로 cnt가 2인 값을 찾음.
            if (cnt == 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static int setFindRange(int n, int m) {
        int isPrime = 0;
        for (int i = n; i <= m; i++) {
            if (isPrimeNum(i)) {
                map.put(i, i);
                isPrime++;
            }
        }

        return isPrime;
    }

    static int[] makePrimeArr(Map<Object, Object> map) {

        Set<Object> keys = map.keySet();
        List<Object> keyList = new ArrayList<Object>(keys);
        int[] primeArr = new int[map.size()];
        for (int i = 0; i < primeArr.length; i++) {
            primeArr[i] = (int) keyList.get(i);
        }
        return primeArr;
    }

    public static void main(String[] args) {
        // 입력받는 부분
        int n = sc.nextInt();
        int m = sc.nextInt();

        int primeCnt = setFindRange(n, m);
        int[] result = makePrimeArr(map);

        if (primeCnt > 0) {
            int primeSum = 0;
            for (int i = 0; i < result.length; i++) {
                primeSum += result[i];
            }
            System.out.println(primeSum);
            System.out.println(result[0]);
        } else {
            System.out.println(-1);
        }

    }
}
