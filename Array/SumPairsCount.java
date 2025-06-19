// Given an array of integers and a number k, find the number of pairs of elements in the 
// array whose sum is equal to k.
// arr = [1, 5, 7, -1, 5]
// k = 6

import java.util.HashMap;

public class SumPairsCount {
  public static void main(String[] args) {
    int[] nums = { 1, 5, 7, -1, 5 };
    int k = 6;
    int count = 0;
    // time complexity - O(n^2)
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == k) {
          count++;
        }
      }
    }
    System.out.println("count of pairs is " + count);

    // optimize time complexity to O(n) by using HashMap
    // space complexity O(n) using hashmap
    HashMap<Integer, Integer> map = new HashMap<>();
    int cnt = 0;
    for (int num : nums) {
      int compliment = k - num;
      if (map.containsKey(compliment)) {
        cnt += map.get(compliment);
      }
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    System.out.println("count of pairs using hashmap " + cnt);
  }
}
