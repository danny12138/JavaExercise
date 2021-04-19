package com.danny.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class sort {
    static int[] generateRandomArray(){
        int range = 10000;
        Random r = new Random();
        int[] arr = new int[range];
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(range);
        }
        return arr;
    }

    int[] arr = new int[]{14,12,15,13,11,16};
    @Test
    public void testSort() {
        int[] arr = generateRandomArray();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        Arrays.sort(arr);
        MergeSort.sort(arr2);
//        ShellSort.sort(arr2);
//        SelectionSort.sort(arr2);
//        BubbleSort.sort(arr2);
        boolean same = true;
        for (int i = 0; i < arr2.length; i++){
            if (arr[i] != arr2[i]) same = false;
        }
        System.out.println(same == true ? "right" : "wrong");
        if (!same){
            System.out.println("正确顺序:"+Arrays.toString(arr));
            System.out.println("你的顺序:"+Arrays.toString(arr2));
        }
    }

    @Test
    public void testBubble() {
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testInsertion() {
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testShellSort() {
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testMergeSort() {
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void name() {

    }
}
