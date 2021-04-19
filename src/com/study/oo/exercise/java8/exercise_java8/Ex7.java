package com.study.oo.exercise.java8.exercise_java8;
//练习七：Stream综合练习
//        问题：
//        现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以
//        下若干操作步骤：
//        \1. 第一个队伍只要名字为3个字的成员姓名；
//        \2. 第一个队伍筛选之后只要前6个人；
//        \3. 第二个队伍只要姓张的成员姓名；
//        \4. 第二个队伍筛选之后不要前1个人；
//        \5. 将两个队伍合并为一个队伍；
//        两个队伍（集合）的代码如下：


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("菩提老祖","孙悟空","太乙真人","太上老君","东华帝君","二郎神","猪八戒","哮天犬","沙悟净","白骨精","哪吒","白龙马","唐三藏"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("郭靖","张三丰","张翠山","张无忌","韦小宝","张君宝","杨过"));
        Stream stream1 = list1.stream().filter(x->x.length()==3).limit(6);
        Stream stream2 = list2.stream().filter(x->x.startsWith("张")).skip(1);
        Stream newStream = Stream.concat(stream1,stream2);
        ArrayList<String> newList = new ArrayList<>();
        newStream.forEach(x->newList.add(x.toString()));
        System.out.println(newList);
    }
}
