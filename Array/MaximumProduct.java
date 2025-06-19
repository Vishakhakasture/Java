public class MaximumProduct {
  public static void main(String[] args) {
    // Time complexity - O(n) where n is a number of elements in array
    // Looping only onece for complete array
    // Space complexity - O(1) constant as we havent used extra ds or array
    int[] nums = { 1, 20, 5, 6, 9 };
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max1) {
        max2 = max1;
        max1 = nums[i];
      } else if (nums[i] > max2 && nums[i] != max1) {
        max2 = nums[i];
      }
    }
    System.out.println("maximum product from array is " + max1 * max2);
  }
}
