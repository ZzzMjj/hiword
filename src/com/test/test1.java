package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zmj
 * @Date: 2020/4/17 13:53
 */
public class test1 {
    public static void main(String[] args) {
        Set<Integer> hasgSet = new HashSet<>();
        hasgSet.add(4);
        hasgSet.add(3);
        hasgSet.add(2);
        hasgSet.add(1);
        System.out.println(hasgSet);
    }
}