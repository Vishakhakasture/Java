import java.util.Scanner;

public class InsertEleIndex {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 10, 20, 30, 40, 50 };
    System.out.println("enter the index : ");
    int index = sc.nextInt();
    System.out.println("enter element which should inserted: ");
    int ele = sc.nextInt();
    int[] arr1 = new int[arr.length + 1];
    for (int i = 0; i < index; i++) {
      arr1[i] = arr[i];
    }
    arr1[index] = ele;
    for (int i = index; i < arr.length; i++) {
      arr1[i + 1] = arr[i];
    }
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
  }
}
