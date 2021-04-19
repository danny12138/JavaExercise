package com.study.oo.leetcode;

import java.util.Objects;

public class Q20 {
    public static void main(String[] args) {
        System.out.println(isValid("(([]){})"));
    }

    public static boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return Objects.equals(s, "");
    }
}
