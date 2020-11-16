package chapter04;

/** @title: MethodInit2 @Author Wen @Date: 2020/11/16 0:51 @Version 1.0 */
public class MethodInit2 {
  int i = f();
  int j = g(i);

  int f() {
    return 11;
  }

  int g(int n) {
    return n * 10;
  }
}
