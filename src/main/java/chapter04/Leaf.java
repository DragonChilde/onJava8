package chapter04;

/** @title: Lear @Author Wen @Date: 2020/11/15 23:54 @Version 1.0 */
public class Leaf {
  int i = 0;

  Leaf increment() {
    i++;
    return this;
  }

  void print() {
    System.out.println("i = " + i);
  }

  public static void main(String[] args) {
    //
    Leaf leaf = new Leaf();
    leaf.increment().increment().increment().print();
  }
}
