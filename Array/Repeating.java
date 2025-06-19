//  Given an array of integers, all integers are unique except one. Find the repeating number. 
// [1,2,2,4,5,9] --> 2
// [1,2,3,3,4,5] --> 3 

import java.util.HashMap;

public class Repeating {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 3, 4, 5 };

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num)) {
        System.out.println(num);
      } else {
        map.put(num, 1);
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.println(arr[i]);
        }
      }
    }
  }
}
