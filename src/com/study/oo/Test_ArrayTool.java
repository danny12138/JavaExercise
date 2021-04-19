package com.study.oo;

import java.util.Arrays;

public class Test_ArrayTool {
    public static void main(String[] args) {
        int[] aa = {2,3,7,6,4,5,9,8,1};
        ArrayTool.print(aa);
        ArrayTool.swap(aa,0,8);
        ArrayTool.print(aa);
        Arrays.sort(aa);
        ArrayTool.print(aa);
        System.out.println("元素2的索引为："+Arrays.binarySearch(aa,2));
        System.out.println(Arrays.toString(aa));
        //ArrayTool.print(ArrayTool.sort(aa));
    }
}
