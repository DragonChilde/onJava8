package chapter04;

/** @title: OverloadingOrder @Author Wen @Date: 2020/11/15 23:40 @Version 1.0 */
public class OverloadingOrder {
  static void f(String s, int i) {
    System.out.println("String: " + s + ",int:" + i);
  }

  static void f(int i, String s) {
    System.out.println("int : " + i + " ,String " + s);
  }

  public static void main(String[] args) {
    //
    f("String first", 1);
    String s = " Int first";
    f(99, s);
  }
}
