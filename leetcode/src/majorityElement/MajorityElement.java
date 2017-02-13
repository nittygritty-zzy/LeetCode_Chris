package majorityElement;

public class MajorityElement {

	// This is a trick utilize the condition of: number of majority element is
	// greater than n/2
	
	public static int majorityElement(int[] num) {

		int major = num[0], count = 1;
		for (int i = 1; i < num.length; i++) {
			if (count == 0) {
				count++;
				major = num[i];

			} else if (major == num[i]) {
				count++;
			} else
				count--;
			System.out.println(major);
		}
		return major;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 11, 12, 11, 34, 45, 11, 11, 11, 12, 3, 34, 11, 45, 11,
				11, 11, 65, 76 };

		int major = 0;

		major = majorityElement(num);

		System.out.println("majority element is: " + major);

	}
}
