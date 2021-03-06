package nearbyDups;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NearbyDups {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				// remove the elements that just passed by the window.
				// since the distains of two dups must smaller than k, the
				// element that the window just passed is not nesessary
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		printCollection(set);
		return false;
	}

	public static void printCollection(Collection<Integer> c) {
		Iterator<Integer> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 5 };
		System.out
				.println("The result is: " + containsNearbyDuplicate(nums, 6));
	}
}
