package com.study.oo.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class UglyNumber {
    public static void main(String[] args) {
        int a = '2';
        System.out.println(a);
        GetUglyNumber_Solution(7);
    }
    public static int GetUglyNumber_Solution(int index) {
        if(index < 7) return index;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while(list.size()<index){
            int m2 = list.get(i2)*2;
            int m3 = list.get(i3)*3;
            int m5 = list.get(i5)*5;
            int min = Math.min(m2,Math.min(m3,m5));
            list.add(min);
            if (min == m2) i2++;
            if (min == m3) i3++;
            if (min == m5) i5++;
        }
        System.out.println(list.toString());
        return list.get(index-1);
    }
}
