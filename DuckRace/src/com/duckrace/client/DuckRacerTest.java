package com.duckrace.client;

import com.duckrace.DuckRacer;
import com.duckrace.enumeration.Reward;

import java.util.ArrayList;

public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer scottJ = new DuckRacer(14,"Scott J", new ArrayList<>());
        scottJ.getRewards().add(Reward.PRIZES);
        System.out.println(scottJ);
    }
}
