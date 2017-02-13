package powerOfTwo;

public class PowerOfTwo {
	
	//add a comment

	public static boolean isPowOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowOfTwo(-8));
	}

}
