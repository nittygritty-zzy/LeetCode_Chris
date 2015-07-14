package swapArrayElement;

public class SwapArrayElement {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SwapArrayElement().swap(5, 3);
	}

	/**
	 * 异位运算交换两个整数
	 * 
	 * @param a
	 * @param b
	 */
	public void swap(int a, int b) {
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		// 写法一：以a作为临时变量
		// a=a^b;
		// b=b^a;
		// a=b^a;
		// 写法二：以b作为临时变量
		b = a ^ b;
		a = a ^ b;
		b = a ^ b;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}
}