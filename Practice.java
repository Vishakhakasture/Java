public class Practice {
  public static void reverse() {
    int num = 123;
    int res = 0;
    while (num > 0) {
      int rem = num % 10;
      res = res * 10 + rem;
      num = num / 10;
    }
    System.out.println("reverse number is : " + res);
  }

  public static int palindrome(int num) {
    int res = 0;
    while (num > 0) {
      int rem = num % 10;
      res = res * 10 + rem;
      num = num / 10;
    }
    return res;
  }

  public static int findDigit(int num) {
    int digit = 0;
    while (num > 0) {
      digit++;
      num = num / 10;
    }
    return digit;
  }

  public static int armstrong(int num) {
    int res = 0;
    int digit = findDigit(num);
    while (num > 0) {
      int rem = num % 10;
      res = (int) Math.pow(rem, digit) + res;
      num = num / 10;
    }
    return res;
  }

  public static void fibonacci(int num) {
    int a = 0;
    int b = 1;
    int res = 0;
    for (int i = 1; i <= num; i++) {
      System.out.println(a);
      res = a + b;
      a = b;
      b = res;
    }
  }

  public static void main(String args[]) {
    // reverse number
    reverse();
    // palindrome
    int num = 131;
    int res = palindrome(num);
    if (res == num) {
      System.out.println("number is palindrome");
    } else {
      System.out.println("number is not palindrome");
    }
    // armstrong number
    int no = 153;
    int resarm = armstrong(no);
    if (no == resarm) {
      System.out.println("number is armstrong");
    } else {
      System.out.println("number is not armstrong");
    }
    // fibonacci series
    int n = 10;
    fibonacci(n);
  }
}
