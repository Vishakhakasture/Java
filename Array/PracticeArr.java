// 1st practice problem of array
// Input:  nums = [1,1,2,2,3,4,4,5]
// Output: 5
// Modified array: [1,2,3,4,5,_,_,_,_] ← underscores mean “don’t care”

// 2nd practice problem of array

public class PracticeArr {
  public static void main(String args[]) {
    // time complexity - O(n) for each i = 1 to i = n- 1 where n is the length of
    // array
    int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
    // using two pointers approach
    int j = 0; // points to the unique elements in the array
    for (int i = 1; i < arr.length; i++) {
      if (arr[j] != arr[i]) {
        j++;
        arr[j] = arr[i];
      }
    }
    System.out.println(j + 1);
  }
}
