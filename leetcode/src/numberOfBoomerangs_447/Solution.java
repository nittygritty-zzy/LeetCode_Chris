package numberOfBoomerangs_447;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Apple on 2/16/17.
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {

        /*points can be represented of a two dimentional array*/
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (int val : map.values()) {
                res += val * (val - 1);
            }
            map.clear();
        }
        return res;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }
}
