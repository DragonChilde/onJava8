package chapter04;

/** @title: Rock2 @Author Wen @Date: 2020/11/15 23:30 @Version 1.0 */
public class Rock2 {
  public Rock2(int i) {
    System.out.println("Rock " + i + " ");
  }
}

class SimpleConstructor2 {
  public static void main(String[] args) {
    //
    for (int i = 0; i < 8; i++) {
      //
      new Rock2(i);
    }
  }
}
