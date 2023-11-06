/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;
import java.util.List;

public class Order {
    private final String id;

    public Order(String id) {
        this.id = id;
    }

    /**
     * TODO:
     * get the items from the cart and iterate over them, print each item's product code
     * get cart total and print
     */
    public <T extends Product> void processCart(ShoppingCart<T> cart) {
        System.out.println("Order: " + getId());
        for(Product product : cart.allItems()) {
            System.out.println(product.getCode());
        }

        System.out.println(cart.total());
    }

    public String getId() {
        return id;
    }
}