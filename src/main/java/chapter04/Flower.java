package chapter04;

/** @title: Flower @Author Wen @Date: 2020/11/16 0:00 @Version 1.0 */
public class Flower {
  int petalCount = 0;
  String s = "initial value";

  Flower(int petalCount) {
    this.petalCount = petalCount;
    System.out.println("Constructor w/ int arg only , petalCount = " + petalCount);
  }

  Flower(String s) {
    System.out.println("Constructor w/ string arg only, s = " + s);
    this.s = s;
  }

  Flower(int petalCount, String s) {
    this(petalCount);
    this.s = s;
    System.out.println("String & int args");
  }

  Flower() {
    this(47, "hi");
    System.out.println("no-arg constructor");
  }

  void printPetalCount() {
    System.out.println("petalCount = " + petalCount + " s = " + s);
  }

  public static void main(String[] args) {
    //
    Flower flower = new Flower();
    flower.printPetalCount();
  }
}
