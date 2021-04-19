package com.study.oo.exercise.io;
//2、键盘录入一个文件夹路径，统计该文件夹的大小


import java.io.File;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File fl = new File(path);
        System.out.println(getFileSize(fl));
        sc.close();
    }
    static long size = 0;
    static long getFileSize(File f){
        //long size = 0;
        if (f.isDirectory()) {
            File[] fList = f.listFiles();
            for (File fi : fList){
                getFileSize(fi);
            }
        }
        else {
            System.out.println(f);
            size += f.length();
        }
        return size;
    }
}
