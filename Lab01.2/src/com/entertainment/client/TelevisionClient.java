package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television("Sony", 50);
        Television tv2 = new Television("Sony", 40);
        Television tv3 = new Television("Samsung", 32);
        Television tv4 = new Television("LG", 12);

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tv1);
        tvs.add(tv2);
        tvs.add(tv3);
        tvs.add(tv4);

        System.out.println(tv2.equals(tv1));
        System.out.println(tv1.hashCode());
        System.out.println(tv2.hashCode());


        for(Television tv : tvs) {
            System.out.println(tv);
        }
     }
}
