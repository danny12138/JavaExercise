package com.danny;

import org.junit.Test;

public class test {

    @Test
    public void name() {
        int ans = solve(1,10);
        System.out.println(ans);
    }

    public int solve (int n, int m){
        int count = 0;
        while (n != m){
            if (n<m){
                if (Math.abs(m-(n*n))<(m-(n+1))){
                    n=n*n;
                } else {
                    n=n+1;
                }
            } else {
                n=n-1;
            }
            count++;
            System.out.println(n+"---"+m);
            System.out.println((m-n*2)+"+++"+(m-1));
        }
        return count;
    }
}
