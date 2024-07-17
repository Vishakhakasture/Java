public class MaxIn2D {
  public static void main(String[] args) {
    int[][] arr = {
        { 2, 4, 6 },
        { 1, 3, 5, 78 },
        { 12, 14, 16, 18, 990 },
        { 8, 10 }
    };
    System.err.println("maximum is: " + maxNum(arr));
  }

  public static int maxNum(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
    return max;
  }
}
