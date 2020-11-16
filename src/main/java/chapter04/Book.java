package chapter04;

import onjava.Nap;

/** @title: Book @Author Wen @Date: 2020/11/16 0:17 @Version 1.0 */
public class Book {
  boolean checkedOut = true;

  public Book(boolean checkedOut) {
    this.checkedOut = checkedOut;
  }

  void checkIn() {
    checkedOut = false;
  }

  @Override
  protected void finalize() throws Throwable {
    if (checkedOut) {
      System.out.println("Error:checked out");
    }
  }
}

class TerminationCondition {
  public static void main(String[] args) {
    //
    Book book = new Book(true);
    book.checkIn();
    new Book(true);
    System.gc();
    new Nap(1);
  }
}
