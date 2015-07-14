package houseRobber;

public class HouseRobber {

	public int rob(int[] num) {
		int rob = 0;// max monney can get if rob current house
		int notRob = 0;// max money can get if not rob current house

		for (int i = 0; i < num.length; i++) {
			int curRob = notRob + num[i]; // if rob current value, previous
											// house must not be robbed
			notRob = Math.max(rob, notRob);// if not rob ith house, take the max
											// value of robbed (i-1)th house and
											// not rob (i-1)th house
			rob = curRob;
		}
		return Math.max(rob, notRob);
	}
}
