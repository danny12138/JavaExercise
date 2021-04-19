package com.study.oo.exercise.java8.exercise_java8;
//简述单列集合、双列集合、数组分别如何获取Stream流对象，并进行演示
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        //单列集合:
        List<String> list = new ArrayList<>();
        list.stream();
        Map<String,Integer> map = new HashMap<>();

        //双列集合:
        //通过keySet:
        map.keySet().stream();
        //通过EntrySey:
        map.entrySet().stream();
        //通过values();
        map.values().stream();

        //数组
        //通过静态方法Stream.of:
        Integer[] arr = new Integer[5];
        Stream.of(arr);
    }
}
