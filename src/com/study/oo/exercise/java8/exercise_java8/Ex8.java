package com.study.oo.exercise.java8.exercise_java8;
/*
问题：
以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
全球	1、 《教父》	2、 《肖申克的救赎》	3、 《辛德勒的名单》	4、 《公民凯恩》	5、
《卡萨布兰卡》	6、 《教父续集》	7、 《七武士》
8、 《星球大战》	9、 《美国美人》
10、 《飞跃疯人院》
华人
1、 《霸王别姬》	2、 《大闹天宫》	3、 《鬼子来了》	4、 《大话西游》	5、 《活着》
6、 《饮食男女》	7、 《无间道》
8、 《天书奇谭》	9、 《哪吒脑海》
10、 《春光乍泄》
1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
2、通过流的方式
1）打印全球影片排行榜中的前三甲影片名
2）打印华人影片排行榜中倒数5名的影片名
3）将两个排行榜中的前5名挑出来合并并打印
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("《教父》","《肖申克的救赎》","《辛德勒的名单》","《公民凯恩》", "《卡萨布兰卡》","《教父续集》","《七武士》", "《星球大战》","《美国美人》","《飞跃疯人院》"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("《霸王别姬》","《大闹天宫》","《鬼子来了》","《大话西游》","《活着》","《饮食男女》","《无间道》","《天书奇谭》","《哪吒脑海》","《春光乍泄》"));
        System.out.println("1）打印全球影片排行榜中的前三甲影片名:");
        list1.stream().limit(3).forEach(System.out::println);
        System.out.println("2）打印华人影片排行榜中倒数5名的影片名");
        list1.stream().skip(5).forEach(System.out::println);
        System.out.println("3）将两个排行榜中的前5名挑出来合并并打印");
        Stream.concat(list1.stream().limit(5),list2.stream().limit(5)).forEach(System.out::println);
    }
}
