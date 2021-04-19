package com.study.oo.exercise_api;

public class hw2 {
    /*分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数

	提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。*/
    public static void main(String[] args) {
        String[] str = {"010","3223","666","7890987","123123"};
        StringBuilder ans = new StringBuilder();
        String output = "";
        for (String aa : str) {
            StringBuilder ab = new StringBuilder(aa);
            ab.reverse();
            String bb = String.valueOf(ab);
            if (aa.equals(bb)) {
                ans.append(aa).append(" 是对称的, ");
            } else {
                ans.append(aa).append(" 是不对称的, ");
            }
        }
        ans.delete(ans.length()-2,ans.length()-1);
        System.out.println(ans);
    }
}
