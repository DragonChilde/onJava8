package chapter04;

/** @title: Window @Author Wen @Date: 2020/11/16 0:54 @Version 1.0 */
class Window {
  public Window(int marker) {
    System.out.println("window( " + marker + " )");
  }
}

class House {
  Window window = new Window(1);

  public House() {
    System.out.println("House()");
     w3 = new Window(33);
  }

  Window w2 = new Window(2);

  void f() {
    System.out.println("f()");
  }

  Window w3 = new Window(3);
}

class OrderOfInitialization {
  public static void main(String[] args) {
    //
    House house = new House();
    house.f();
  }
}
