package com.study.oo;

public class ArrayTool {
    /**
     * 数组工具包
     * 包含数组打印、最值、反转和排序
     * @version v1.0
     * @since v1.0
     * @auther Danny
     */
    /**
     * @param arr 输入一个数组
     * @return 依次打印出该数组的各个位置
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param arr 输入一个数组
     * @return max 找到该数组的最大值
     */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * @param arr 输入一个数组
     * @return min 找到该数组的最小值
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * @param arr 输入一个数组
     * @return arr 输出一个反转过后的数组
     */
    public static int[] reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    /**
     * @param arr 输入一个数组和两个索引
     * @return arr 输出两个元素交换后的数组
     */
    public static int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    /**
     * @param arr 输入一个数组
     * @return arr 输出冒泡排序后的数组
     */
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
