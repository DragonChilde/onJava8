package chapter04;

/**
 * @title: Brid2
 * @Author Wen
 * @Date: 2020/11/15 23:48
 * @Version 1.0
 */
public class Brid2 {
    public Brid2(int i) {
    }

    public Brid2(double d) {
    }
}

class NoSynthesis{
  public static void main(String[] args) {
    //
      //Brid2 b1 = new Brid2();
      Brid2 b2 = new Brid2(1);
      new Brid2(1.0);
  }
}