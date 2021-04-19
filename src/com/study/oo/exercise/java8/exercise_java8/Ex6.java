package com.study.oo.exercise.java8.exercise_java8;
//组合：concat
//        问题：
//        已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并


import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        String[] arr1 = {"郭靖","杨康"};
        String[] arr2 = {"黄蓉","穆念慈"};
        Stream<String> stream = Stream.concat(Stream.of(arr1),Stream.of(arr2));
        stream.forEach(System.out::println);
    }
}
