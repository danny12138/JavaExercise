package com.study.oo.nowcoder;

import java.util.ArrayList;

public class $LongestCommonStr {
    public static void main(String[] args) {
        System.out.println(LCS("1A2C3D4B56","B1D23CA45B6A"));
    }
    public static String LCS (String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        String ans = "";
            for (int i = 0; i < s1.length(); i++){
                for (int j = ans.length()==0?0:s2.indexOf(ans.charAt(ans.length()-1)); j < s2.length(); j++){
                    if (s1.charAt(i) == s2.charAt(j)){
                        ans += s1.charAt(i);
                        break;
                    }
                }
            }
            list.add(ans);

        System.out.println(list);

        // write code here
        return list.size() == 0 ? "-1" : list.get(0);
    }
}
