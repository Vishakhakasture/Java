package String;

public class SB {
  public static void main(String[] args) {
    // mutable strings can be change or modify
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 26;i++) {
      char ch = (char)('a' + i);
      sb.append(ch);
    }
    System.out.println(sb);
    sb.append("vishakha");
    System.out.println(sb);
  }
}
