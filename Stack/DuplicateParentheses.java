import java.util.*;

public class DuplicateParentheses {
  public static boolean isDuplicate(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // closing case
      if (ch == ')') {
        int count = 0;
        while (!s.isEmpty() && s.peek() != '(') {
          s.pop();
          count++;
        }
        if (count < 1) {
          return true; // duplicate
        } else {
          s.pop();
        }
      } else {
        s.push(ch);
      }
    }
    return false;
  }

  public static void main(String args[]) {
    String s = "(((a+b) + (c-d)))";
    System.out.println(isDuplicate(s));
  }
}
