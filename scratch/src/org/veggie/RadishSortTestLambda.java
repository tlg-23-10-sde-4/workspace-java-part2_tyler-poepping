package org.veggie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RadishSortTestLambda {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red", 2.1,1.0, 0));
        radishes.add(new Radish("black", 2.5, 1.3,3));
        radishes.add(new Radish("red", 1.5, 1.1, 2));

        radishes.sort(Comparator.comparingDouble(Radish::getTailLength));
        dump(radishes);

    }

    private static void dump(List<Radish> radishes) {
        for(Radish radish : radishes) {
            System.out.println(radish);
        }
    }
}
