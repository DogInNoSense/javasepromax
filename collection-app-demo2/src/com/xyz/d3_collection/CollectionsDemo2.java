package com.xyz.d3_collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); // 可以有重复
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));

        Collections.sort(apples); // Apple类已经重写了比较规则
        System.out.println(apples);

        // 方式2: sort方法自带比较器对象
//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o1.getPrice(), o2.getPrice());
//            }
//        });

        Collections.sort(apples, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        System.out.println(apples);
    }
}
