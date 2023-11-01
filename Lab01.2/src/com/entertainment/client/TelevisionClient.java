package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 20);

        tv1.setBrand("Null");
        tv1.setVolume(20);

        System.out.println(tv2.equals(tv1));
        System.out.println(tv1.hashCode());
        System.out.println(tv2.hashCode());

        Set<Television> tvs = new HashSet<>();
        tvs.add(tv2);
        tvs.add(tv1);
        System.out.println(tvs);
     }
}
