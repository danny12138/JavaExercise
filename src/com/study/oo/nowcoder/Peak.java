package com.study.oo.nowcoder;

public class Peak {
    public static void main(String[] args) {
        int ans = solve(new int[] {2,4,1,2,7,8,4},7);
        System.out.println(ans);
    }

    public static int solve(int[] a, int aLen) {
        for(int i=aLen-1; i>=0; i--){
            if (a[i] > a[i - 1]){
                return i;
            }
        }
        return 0;
    }
}
