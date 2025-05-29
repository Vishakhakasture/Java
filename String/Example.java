package String;

import java.util.HashMap;
//  Given an array of integers, all integers are unique except one. Find the repeating number. 
// [1,2,2,4,5,9] --> 2
// [1,2,3,3,4,5] --> 3 

public class Example {
  public static int repeating(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num)) {
        return num;
      } else {
        map.put(num, 1);
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 4, 5, 6, 3, 5, 1 };
    int res = repeating(arr);
    System.out.println(res);
  }
}