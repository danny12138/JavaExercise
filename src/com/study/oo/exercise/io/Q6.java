package com.study.oo.exercise.io;
//6、用代码实现以下需求
//  (1)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
//  (2)打印格式：
//   to=3
//    think=1
//    you=2
//    //........
//  (3)按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用高效流)


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) throws IOException {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        FileWriter fw = new FileWriter("D:\\Java\\IOTestFile\\count.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String[] strArr = str.split(" ");
        HashMap<String, Integer> mp = new HashMap<>();
        for (String elem : strArr){
            mp.put(elem,mp.containsKey(elem)?mp.get(elem)+1:1);
        }
        Set<Map.Entry<String, Integer>> entrySet = mp.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet){
            bw.write(entry.getKey()+"="+entry.getValue());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
