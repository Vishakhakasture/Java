package String;
// lexicographically largest string

public class LargestString {

	public static void main(String[] args) {
		// time complexity = O(x*n) where x is number of letters
		String fruits[] = { "apple", "kiwi", "banana", "mango" };
		String largest = fruits[0];
		for (int i = 0; i < fruits.length; i++) {
			if (largest.compareTo(fruits[i]) < 0) {
				largest = fruits[i];
			}
		}
		System.out.println(largest);
	}

}
