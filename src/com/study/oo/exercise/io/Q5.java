package com.study.oo.exercise.io;
//5、获取一个文本上每个字符出现的次数,将结果写在times.txt上

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) throws IOException {
        FileReader rf = new FileReader("D:\\Java\\IOTestFile\\test.txt");
        ArrayList<Character> aL = new ArrayList<>();
        int i;
        while ((i=rf.read())!=-1){
            aL.add((char) i);
        }
        Map<Character,Integer> mp = new HashMap<>();
        for (char cc : aL){
            mp.put(cc,mp.containsKey(cc)?mp.get(cc)+1:1);
        }

        FileWriter fw = new FileWriter("D:\\Java\\IOTestFile\\time.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        Set<Character> keySet = mp.keySet();
        for (Character cc : keySet){
            bw.write("字符 "+cc+" 出现了"+mp.get(cc)+"次");
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
