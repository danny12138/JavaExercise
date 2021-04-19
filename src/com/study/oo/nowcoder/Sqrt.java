package com.study.oo.nowcoder;

class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(0));
    }
    public static int sqrt (int x) {
        int y = 1;
        while (y*y <= x){
            y += 1;
        }
        return y-1;
    }
}
