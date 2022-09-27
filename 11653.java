import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Map<Object, Object> factorization(int n) {
        Map<Object, Object> map = new LinkedHashMap<>();
        int divideCnt = 2;
        int mapCnt = 0;
        while (n > 1) {
            if (n % divideCnt == 0) {
                n /= divideCnt;
                map.put(mapCnt, divideCnt);
                mapCnt++;
            } else {
                divideCnt++;
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // 입력받는 부분
        int n = sc.nextInt();
        if (n == 1) {

        } else {
            Map<Object, Object> resultMap = factorization(n);

            for (int i = 0; i < resultMap.size(); i++) {
                System.out.println(resultMap.get(i));
            }
        }
    }
}
