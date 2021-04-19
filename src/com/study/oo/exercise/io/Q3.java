package com.study.oo.exercise.io;
//3、键盘录入一个文件夹路径，统计该文件夹下的各种后缀名的文件的个数
//  例如：.txt有10个，.java有30个......

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File fi = new File(path);
        File[] fileList = fi.listFiles();
        Map<String,Integer> mp = new HashMap<>();
        for (File f : fileList){
            if (f.isFile()){
                String file = f.getName();
                String suffix = file.substring(file.lastIndexOf('.'),file.length());
                mp.put(suffix,mp.containsKey(suffix)?mp.get(suffix)+1:1);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet = mp.entrySet();
        for (Map.Entry<String,Integer> elem : entrySet){
            System.out.println(elem.getKey()+"有"+elem.getValue()+"个");
        }
        sc.close();
    }
}
