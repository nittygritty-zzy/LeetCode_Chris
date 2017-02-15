package convertToBase7_504;

/**
 * Created by Apple on 2/14/17.
 */

public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        String res = "";
        boolean isNeg = num < 0;
        while (num != 0) {
            res = Math.abs(num % 7) + res;
            num /= 7;
        }
        return isNeg ? "-" + res : res;
    }
}