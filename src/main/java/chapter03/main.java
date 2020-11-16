package chapter03;

import static onjava.Range.range;

/** @title: main @Author Wen @Date: 2020/11/15 23:15 @Version 1.0 */
public class main {
  public static void main(String[] args) {
    //
    for (int range : range(1, 10, 2)) {
      System.out.println("range is " + range);
    }
  }
}
