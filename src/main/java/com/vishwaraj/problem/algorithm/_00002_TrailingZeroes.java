package com.vishwaraj.problem.algorithm;

public class _00002_TrailingZeroes {

    public long trailingZeros(long n) {
        // write your code here
        long ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}
