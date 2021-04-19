package com.study.oo.exercise.java8.exercise_java8;
//练习四：过滤：filter
//        问题：
//        有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素过滤

import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        String[] str = {"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        Stream<String> stream = Stream.of(str).filter(x->x.startsWith("郭"));
        stream.forEach(System.out::println);
    }
}
