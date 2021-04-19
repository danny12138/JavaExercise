package com.study.oo.nowcoder;

import java.util.ArrayList;

public class MinKNum {
    public static void main(String[] args) {
        int [] test = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(test,7));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> aL = new ArrayList<>();
        if (k>input.length){
            return aL;
        }
        ArrayList<Integer> newInput = new ArrayList<>();
        for (int temp : input){
            newInput.add(temp);
        }
        while (aL.size()<k){
            int min = newInput.get(0);
            int index = 0;
            for (int i = 0; i < newInput.size(); i++){
                if (newInput.get(i) < min){
                    min = newInput.get(i);
                    index = i;
                }
            }
            newInput.remove(index);
            aL.add(min);
        }
        return aL;
    }
}
