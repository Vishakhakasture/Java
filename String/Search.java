package String;

import java.util.*;

public class Search {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char target = 'a';
    int res = searchStr(str, target);
    System.out.println("charcter present at " + res);
  }

  public static int searchStr(String str, char target) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        return i;
      }
    }
    return -1;
  }
}
