package readBinaryWatch_401;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apple on 2/16/17.
 */
public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
            }
        }
        return times;
    }
}

