package com.study.oo.exercise_api;

public class hw5 {
    public static void main(String[] args) {
        /*
        定义一个方法，功能如下：给定一个数组，转换成一个字符串
        例如：数组为int[] arr = {1, 2, 3}，字符串为[1, 2, 3]
         */
        int[] test = {1,2,3};
        String output = Method(test);
        System.out.println(output);

    }
    private static String Method(int[] arr) {
        StringBuilder sb2 = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++){
            if (i==arr.length-1){
                sb2.append(arr[i]+"]");
            }
            else {
                sb2.append(arr[i]+",");

            }
        }
        return String.valueOf(sb2);
    }
}
