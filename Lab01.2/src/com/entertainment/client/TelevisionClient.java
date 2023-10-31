package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 20);

        tv1.setBrand("RCA");
        tv1.setVolume(20);

        System.out.println(tv2.equals(tv1));
    }
}
