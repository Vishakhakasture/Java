import java.util.ArrayList;

public class StackDS {
  static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    // isEmpty methid to check stack is empty or filled
    public static boolean isEmpty() {
      return list.size() == 0;
    }

    // push method to add the data on to the stack
    public static void push(int data) {
      list.add(data);
    }

    // pop mehtod to remove data from stack
    public static int pop() {
      if (isEmpty()) {
        return -1;
      }
      int data = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return data;
    }

    // peek method to peek the data from stack
    public static int peek() {
      if (isEmpty()) {
        return -1;
      }
      return list.get(list.size() - 1);
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }

}
