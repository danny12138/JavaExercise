package com.study.oo.exercise.io;


import java.io.File;
import java.util.Scanner;

//1、键盘录入一个文件夹路径，删除该文件夹（包含文件夹内容）
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File fl = new File(path);
        deleteFile(fl);
        sc.close();
    }
    static void deleteFile(File fn){
        File[] fList = fn.listFiles();
        for (File f : fList) {
            if (f.isDirectory()){
                deleteFile(f);
            }else {
                f.delete();//递归搜索删除文件
            }
        }
        fn.delete();//删除最外面的文件
    }
}
