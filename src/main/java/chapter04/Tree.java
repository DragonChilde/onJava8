package chapter04;

/** @title: Tree @Author Wen @Date: 2020/11/15 23:35 @Version 1.0 */
 class Tree {
  int height;

  public Tree() {
    System.out.println("Planting a seeding");
    height = 0;
  }

  public Tree(int height) {
    this.height = height;
    System.out.println("Creating new Tree that is " + height + " feet tall");
  }

  void info() {
    System.out.println("Tree is " + height + " feet tall");
  }

  void info(String s) {
    System.out.println(s + ": Tree is " + height + " feet tall");
  }
}

class Overloading{
  public static void main(String[] args) {
    //
    for (int i = 0; i < 5; i++) {
        Tree tree = new Tree(i);
        tree.info();
        tree.info("overloaded method");

    }

    new Tree();
  }
}
