package com.entertainment;

import java.util.Comparator;

public class TelevionBrandComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        return tv1.getBrand().compareTo(tv2.getBrand());
    }
}
