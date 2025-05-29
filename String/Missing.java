package String;

public class Missing {
  public static int missingNum(int arr[], int n) {
    // sum of first n natural numbers
    int total = n * (n + 1) / 2;
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }

    return total - sum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5, 6 };
    int n = arr.length + 1;
    int num = missingNum(arr, n);
    System.out.println(num);
  }
}
