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

      printer1.start();
      printer2.start();
  }
}