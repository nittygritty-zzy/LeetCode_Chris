package getSum;

/**
 * Created by Apple on 2/12/17.
 * <p>
 * <p>
 * "&" AND operation, for example, 2 (0010) & 7 (0111) => 2 (0010)
 * <p>
 * "^" XOR operation, for example, 2 (0010) ^ 7 (0111) => 5 (0101)
 * <p>
 * "~" NOT operation, for example, ~2(0010) => -3 (1101) what??? Don't get frustrated here. It's called two's complement.
 * <p>
 * 1111 is -1, in two's complement
 * <p>
 * 1110 is -2, which is ~2 + 1, ~0010 => 1101, 1101 + 1 = 1110 => 2
 * <p>
 * 1101 is -3, which is ~3 + 1
 * <p>
 * so if you want to get a negative number, you can simply do ~x + 1
 * <p>
 * Reference:
 * <p>
 * https://en.wikipedia.org/wiki/Two%27s_complement
 * <p>
 * https://www.cs.cornell.edu/~tomf/notes/cps104/twoscomp.html
 * <p>
 * For this, problem, for example, we have a = 1, b = 3,
 * <p>
 * In bit representation, a = 0001, b = 0011,
 * <p>
 * First, we can use "and"("&") operation between a and b to find a carry.
 * <p>
 * carry = a & b, then carry = 0001
 * <p>
 * Second, we can use "xor" ("^") operation between a and b to find the different bit, and assign it to a,
 * <p>
 * Then, we shift carry one position left and assign it to b, b = 0010.
 * <p>
 * Iterate until there is no carry (or b == 0)
 */
public class Solution {
    public static void main(String[] args) {
        Solution sv = new Solution();
        System.out.println(sv.getSum(2, 6));
    }

    // Iterative
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
