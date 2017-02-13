package twoSum;

import java.util.HashMap;
import java.util.Map;

//add data structure
public class Solution2 {
	private Map<Integer, Integer> table = new HashMap<>();

	public void add(int input) {
		int count = table.containsKey(input) ? table.get(input) : 0;
		table.put(input, count + 1);

		System.out.println("Added value to Map, now the table is:");
		System.out.println("--------------");
		for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("--------------");
	}

	public boolean find(int val) {
		for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
			int num = entry.getKey();
			System.out.println("Get a Key: " + num);
			int y = val - num;
			if (y == num) {
				// For duplicates, ensure there are at least two individual
				// numbers.
				if (entry.getValue() >= 2) {
					System.out.println("--------------");
					return true;
				}
			} else if (table.containsKey(y)) {
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Solution2 ts = new Solution2();

		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(3);

		// System.out.println(ts.find(5));
		// System.out.println(ts.find(6));
		System.out.println(ts.find(9));
	}

}
