public class ReverseArray {
  public static void main(String args[]) {
    int[] arr1 = { 10, 20, 30, 40, 50 };
    // using extra array
    int[] arr2 = new int[arr1.length];
    int j = 0;
    for (int i = arr1.length - 1; i >= 0; i--) {
      arr2[j++] = arr1[i];
    }
    System.out.println("reversed array using extra array");
    for (int num : arr2) {
      System.out.print(num + " ");
    }
    System.out.println();
    // not using an extra array
    int start = 0, end = arr1.length - 1;
    while (start < end) {
      // by swapping
      int temp = arr1[start];
      arr1[start] = arr1[end];
      arr1[end] = temp;
      // increment start pointer by 1
      start++;
      // decrement end pointer by 1
      end--;
    }
    System.out.println("reversed array without using xtra array.");
    for (int num : arr1) {
      System.out.print(num + " ");
    }
  }
}
