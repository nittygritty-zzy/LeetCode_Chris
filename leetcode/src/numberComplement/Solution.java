package numberComplement;

/**
 * Created by Apple on 2/12/17.
 */

/**
 * original number: 5
 * binary represent: 101
 * flipped number: 1111 1111 1111 1111 1111 1111 1111 1010
 *
 * */
public class Solution {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public int findComplement1(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num;
        return num & mask;
    }

    public static void main(String[] args) {
        Solution sv = new Solution();
        System.out.println(sv.findComplement(5));
        System.out.println(sv.findComplement1(5));

    }

}
