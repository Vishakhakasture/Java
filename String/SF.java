package String;

public class SF {
  public static void main(String[] args) {
    // mutable string can change and modify
    StringBuffer sf = new StringBuffer("Prashik");
    System.out.println(sf);
    sf.replace(2, 7, "erana");
    System.out.println(sf);
  }
}
