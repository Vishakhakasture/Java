import java.util.*;

public class ActivitySelection {
  public static void main(String[] args) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };

    // if not sorted
    int activities[][] = new int[end.length][3];
    for (int i = 0; i < end.length; i++) {
      activities[i][0] = i; // stores index
      activities[i][1] = start[i]; // stores start value
      activities[i][2] = end[i]; // stores end value
    }

    Arrays.sort(activities, Comparator.comparingInt(o -> o[2])); // sorting end values as it is on 2 column of
                                                                 // activities

    // sorted in end wise
    // int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    // 1st activity
    int maxAct = 1;
    ans.add(activities[0][0]);
    // end of activity that are performed previously
    int lastEnd = activities[0][2];

    for (int i = 1; i < end.length; i++) {
      if (start[i] >= lastEnd) { // overlapping or disjoint condition
        // Activity slection
        maxAct++;
        ans.add(activities[i][0]);
        lastEnd = activities[i][2];
      }
    }

    System.out.println("Maximum activity : " + maxAct);

    for (int i = 0; i < ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");
    }
  }
}
