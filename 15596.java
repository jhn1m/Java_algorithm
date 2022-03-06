/* 
Given n integers, write a function to find the sum of n.

The functions to be written are as follows.

Java: long sum(int[]a); (class name: Test)

a: An array in which n integers need to be summed are stored (0 na[i] 개가1,000,000 and 1 정수n 3,0003,000,000).

Given n integers, write a function to find the sum of n.
 */
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
