import java.util.*;

public class NextGreater {
  public static void main(String args[]) {
    // int arr[] = { 6, 8, 0, 1, 3 };
    int arr[] = { 7, 3, 8, 1, 9, 11 };
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];

    // backward loop for checking or to track the right side elements to find next
    // greater in right if exist then peek from stack
    for (int i = arr.length - 1; i >= 0; i--) {
      // check if empty then return and is smaller elemetn exist pop out that from
      // stack
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }
      // assign next greater
      if (s.isEmpty()) {
        nextGreater[i] = -1;
      } else {
        nextGreater[i] = arr[s.peek()];
      }
      // push index on to the stack
      s.push(i);
    }

    System.out.println(Arrays.toString(nextGreater));
  }

  // this question can be ask as
  // 1. next graeter in right ang is above
  // 2. next greater in left we neet to reverse for loop for(int i = 0; i <
  // arr.length; i++)
  // 3. next smaller in right we need to change while loop condition that
  // -> while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { to s.pop(); greater
  // element }
  // 4. next smaller element in left
  // -> first change for loop for(int i = 0; i < arr.length; i++)
  // -> second update while for >= instead of <=
  // while (!s.isEmpty() && arr[s.peek()] >= arr[i])
}
