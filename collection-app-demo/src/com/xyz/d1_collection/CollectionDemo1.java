package com.xyz.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // collection集合体系的特点
        // 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("java");
        list.add("java");
        list.add(123);
        list.add(false);
        list.add(true);
        System.out.println(list);

        // 无需 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add(123);
        list1.add(false);
        list1.add(true);
        System.out.println(list1);

        System.out.println("--------------------");

        Collection<String> list2 = new ArrayList<>(); // JDK 7 以后后面类型可以不写
        list2.add("java");
//        list2.add(23);
        list2.add("黑马");

        // 集合和泛型不支持基本类型,只能支持引用数据类型数据
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(233);
        list3.add(2333);

        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.4);
        list4.add(233.5);
        list4.add(2333.0);
    }

}
