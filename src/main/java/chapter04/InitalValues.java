package chapter04;

/** @title: InitalValues @Author Wen @Date: 2020/11/16 0:43 @Version 1.0 */
public class InitalValues {
  boolean t;
  char c;
  byte b;
  short s;
  int i;
  long l;
  float f;
  double d;
  InitalValues reference;

  void printInitalValues() {
    System.out.println("Data type Initial value");
    System.out.println("boolean " + t);
    System.out.println("char[ " + c + " ]");
    System.out.println("byte " + b);
    System.out.println("short " + s);
    System.out.println("int " + i);
    System.out.println("long " + l);
    System.out.println("float " + f);
    System.out.println("double " + d);
    System.out.println("reference " + reference);
  }

  public static void main(String[] args) {
    //
    new InitalValues().printInitalValues();
  }
}
