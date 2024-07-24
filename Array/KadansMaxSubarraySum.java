public class KadansMaxSubarraySum {
  public static int kadansSum(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i = 0; i < arr.length; i++)  {
      currSum = currSum + arr[i];
      if(currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum,maxSum);
    } 
    return maxSum;
  }
 public static void main(String args[])  {
  int[] arr = {10,-6,-7,-1,0,12};
  int maxSum = kadansSum(arr);
  System.out.println(maxSum);
 }
}
