package org.veggie;

import java.util.ArrayList;
import java.util.List;
public class RadishSortTest {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("Red", 2.1, 1.0, 0));
        radishes.add(new Radish("Black", 1.0, 0.0, 3));
        radishes.add(new Radish("Red", 2.5, 4.2, 0));
        radishes.add(new Radish("Pink", 0.7, 3.2, 2));

        System.out.println("Original Order");
        dump(radishes);

        System.out.println("Sort by size");
        radishes.sort(null);
        dump(radishes);

        System.out.println("Radishes by Color");
        radishes.sort(new RadishComparator());
        dump(radishes);
    }

    private static void dump(List<Radish> radishes) {
        for(Radish radish : radishes) {
            System.out.println(radish + "\n");
        }
    }
}
