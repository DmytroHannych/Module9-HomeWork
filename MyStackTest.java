package module9;

import java.util.Objects;

public class MyStackTest {
  public static void main(String[] args) {
    MyStack stack = new MyStack();
   stack.push(5);
    stack.push(3);
    stack.push(2);
    System.out.println(stack);
    System.out.println("stack.Size() = " + stack.size());
      stack.remove(2);
      System.out.println(stack);
  }
}
