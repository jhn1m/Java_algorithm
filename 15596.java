public class Test {
    long sum(int[] a) {
        long ans = 0;
        if (a.length >= 1 && a.length <= 3000000) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 0 && a[i] <= 1000000)
                    ans += a[i];
            }
        }
        return ans;
    }
}
