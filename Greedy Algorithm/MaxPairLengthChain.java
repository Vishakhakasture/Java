import java.util.Arrays;
import java.util.Comparator;

public class MaxPairLengthChain {
  public static void main(String[] args) {
    int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

    // 0th col contains pairs first number and 1st col contains pairs second or end
    // number

    Arrays.sort(pairs, Comparator.comparingInt(o -> o[1])); // sorting the pair end wise

    int maxLength = 1;

    int pairEnd = pairs[0][1];

    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > pairEnd) {
        maxLength++;
        pairEnd = pairs[i][1];
      }
    }

    System.out.println("Maximum pair length chain is : " + maxLength);
  }
}
