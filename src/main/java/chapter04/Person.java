package chapter04;

/** @title: Person @Author Wen @Date: 2020/11/15 23:56 @Version 1.0 */
public class Person {
  public void eat(Apple apple) {
    Apple peeled = apple.getPeeled();
    System.out.println("Yummy");
  }

}

class Peeler {
  static Apple pell(Apple apple) {
    return apple;
  }
}

class Apple {
  Apple getPeeled() {
    return Peeler.pell(this);
  }
}

class PassingThis {
  public static void main(String[] args) {
    //
    new Person().eat(new Apple());
  }
}
