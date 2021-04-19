package com.study.oo.exercise.io;
//4、键盘录入一个文件夹路径，作为源文件夹；键盘录入一个文件夹路径，作为目标文件夹
//  写代码将源文件夹拷贝到目标文件夹中
//  例如：
//源文件夹：a
//目标文件夹：b
//拷贝后：b/a


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要拷贝的源文件夹:");
        String path1 = sc.nextLine();
        File fi = new File(path1);
        System.out.println("请输入存放拷贝文件夹的目标文件夹:");
        String path2 = sc.nextLine();
        //调用方法获取文件夹地址与文件地址的集合
        getFileList(fi);
        //根据目标文件夹修改存文件夹的集合中每个文件夹的地址
        String subPath1 = path1.substring(path1.lastIndexOf("\\"),path1.length());
        dirList.replaceAll((s)->path2+s.substring(s.indexOf(subPath1)));
        //创建文件夹
        for (String dir : dirList){
            new File(dir).mkdirs();
        }
        //创建集合用来存储文件移动后的新地址
        ArrayList<String> newFileList = new ArrayList<>();
        for (String file : fileList){
            newFileList.add(path2+file.substring(file.indexOf(subPath1)));
        }
        //遍历新旧文件地址集合并拷贝文件
        for (int i = 0; i < fileList.size(); i++){
            FileInputStream fis = new FileInputStream(fileList.get(i));
            FileOutputStream fos = new FileOutputStream(newFileList.get(i));
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int copy;
            while ((copy=bis.read())!=-1){
                bos.write(copy);
            }
            bis.close();
            bos.close();
        }
    }

    static ArrayList<String> fileList = new ArrayList<>();
    static ArrayList<String> dirList = new ArrayList<>();
    //递归遍历文件夹获取所有文件夹与文件
    static void getFileList(File fn){
        File[] fList = fn.listFiles();
        for (File f : fList) {
            if (f.isDirectory()){
                dirList.add(f.getAbsolutePath());
                getFileList(f);
            }else {
                fileList.add(f.getAbsolutePath());
            }
        }
    }
}
