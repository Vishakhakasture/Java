import java.util.*;

public class ReverseString {
  public static String reverseString(String str) {
    Stack<Character> ch = new Stack<>();
    int index = 0;
    while (index < str.length()) {
      ch.push(str.charAt(index));
      index++;
    }

    StringBuilder result = new StringBuilder();

    while (!ch.isEmpty()) {
      char curr = ch.pop();
      result.append(curr);
    }

    str = result.toString();
    return str;
  }

  public static void main(String[] args) {
    String s = "vishakha";
    String res = reverseString(s);
    System.out.println(res);
  }
}
