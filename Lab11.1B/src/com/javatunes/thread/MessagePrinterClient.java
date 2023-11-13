/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

    public static void main(String[] args) {
        MessagePrinter printer1 = new MessagePrinter("Roses are Red", 1500, 10);
        MessagePrinter printer2 = new MessagePrinter("Violets are Blue", 1550, 10);

        Thread thd1 = new Thread(printer1, "MSG-Printer1");
        thd1.start();

        Thread thd2 = new Thread(printer2, "MSG-Printer2");
        thd2.start();
    }
}