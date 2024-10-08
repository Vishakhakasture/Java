import java.util.ArrayList;

public class IndianCoins {
  public static void main(String[] args) {
    int coins[] = { 2000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

    int count = 0;
    int ammount = 590;

    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < coins.length; i++) {
      if (coins[i] <= ammount) {
        while (coins[i] <= ammount) {
          count++;
          ans.add(coins[i]);
          ammount -= coins[i];
        }
      }
    }

    System.out.println("total required coins are " + count);

    for (int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i) + " ");
    }
    System.out.println();
  }
}
