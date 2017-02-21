package toHex_405;

/**
 * Created by Apple on 2/20/17.
 */

public class Solution {

    /*
    Basic idea:
    each time we take a look at the last four digits of
    binary verion of the input, and maps that to a hex char
    shift the input to the right by 4 bits, do it again
    until input becomes 0.

    For example:
    num = 26
    26 = 0000 0000 0001 1010
    15 = 0000 0000 0000 1111

    loop1: 26 & 15 = 0000 0000 0000 1010 -> res = 'a'
    26 >>> 4 = 0000 0000 0000 0001

    loop2: 2 & 15 = 0000 0000 0000 0001 -> res = '1'
    1 >>> 4 = 0000 0000 0000 0000

    */
    char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {
        if (num == 0) return "0";
        String res = "";
        while (num != 0) {
            res = map[(num & 15)] + res;
            num = (num >>> 4);
        }
        return res;
    }

    public String toHex2(int num) {
        long n = num & 0x00000000ffffffffL;
        String res = "";
        while (n > 0) {
            res = map[(int) (n % 16)] + res;
            n = n / 16;
        }
        return num == 0 ? "0" : res;
    }
}
