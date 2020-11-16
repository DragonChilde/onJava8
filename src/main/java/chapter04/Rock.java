package chapter04;

/**
 * @title: Rock
 * @Author Wen
 * @Date: 2020/11/15 23:26
 * @Version 1.0
 */
class Rock {
    Rock(){
    System.out.print("Rock ");
    }
}

class SimpleConstructor{
  public static void main(String[] args) {
    //
    for (int i = 0; i < 10; i++) {
      //
        new Rock();
    }
  }
}