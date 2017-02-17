package constructRectangle_492;

/**
 * Created by Apple on 2/16/17.
 */
public class Solution {
    public int[] constructRectangle(int area) {
        /*target area, so the ideal output should be sqrt(area)*/
        //so instead of find w,l from 0, to area, we can find the l from
        //sqrt(x) down to 0;
        int w = (int) Math.sqrt(area);
        while (area % w != 0) w--;
        return new int[]{area / w, w};
    }
}
