/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.Catalog;
import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;
import java.util.List;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
//        testFindById();
//         testFindByKeyword();
//         testFindByCategory();
        // testSize();
         testGetAll();
//        testNumberGenreSold();
//            testCheckGenreExist();
        checkPriceForEighties();
    }


    public static InMemoryCatalog catalog = new InMemoryCatalog();

    public static void checkPriceForEighties() {
        Collection<MusicItem> eighties = catalog.getEightiesByPrice(20.0);
        System.out.println(eighties);
    }

    public static void testCheckGenreExist() {
        boolean hasGenre = catalog.checkGenreExist(MusicCategory.JAZZ);
        System.out.println(hasGenre);
    }

    public static void testNumberGenreSold() {
        int total = catalog.numberSold(MusicCategory.BLUES);
        System.out.println("Total of " + MusicCategory.BLUES + " sold is " + total);
    }

    private static void testFindById() {
        System.out.println(catalog.findById(9L) + "\n");
    }

    private static void testFindByKeyword() {
        Collection<MusicItem> items = catalog.findByKeyword("So");

        if (items != null) {
            for (MusicItem item : items) {
                System.out.println(item + "\n");
            }
        } else {
            System.out.println("Nothing found");
        }
    }

    private static void testFindByCategory() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        System.out.println(items + "\n");
    }

    private static void testSize() {
    }

    private static void testGetAll() {
        InMemoryCatalog memoryCatalog = new InMemoryCatalog();
        Collection<MusicItem> all = catalog.getAll();
        System.out.println(all);
    }
}