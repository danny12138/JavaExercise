package com.study.oo.nowcoder;

import java.util.Stack;

public class $calculator {
    public static void main(String[] args) {
        System.out.println(solve("12*2"));
    }

    public static int solve(String s) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char elem = s.charAt(i);
            if (Character.isDigit(elem)){
                stack.push(Integer.parseInt(String.valueOf(elem)));
            }
        }
        System.out.println(stack);
        return ans;
    }
}
