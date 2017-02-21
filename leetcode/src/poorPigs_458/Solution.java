package poorPigs_458;

/**
 * Created by Apple on 2/20/17.
 */

public class Solution {
    /*question analysis:
    Only let one pig die:

    1000 buckets, how many pigs to test within 1 hour.
    * if 1000 pigs drinks at same time, will know in 15 mins
    * if 500 pigs drinks at same time, there is chance that no pig drink poison water, first loop takes 15 mins,
    * next time 500 pigs drink 500 bucket, will take 15 mins to get answer, total time 30 mins.
    if 250 pigs drink at same time, total time 1 hour.

    n buckets, m minutes, p mintotest
    1 -> n pigs, will take 1 * m mins
    2 -> n/2 pigs, will take 2 * m mins
    3 -> n/4 pigs, will take 4 * m mins
    4 -> n/8 pigs, will take 8 * m mins
    ....
    156 bucket,
    (128 + 16 + 8 + 4) * 1 -> (64 + 8 + 4 + 2) * 2 -> (32 + 4 + 2 + 1) * 4 -> (16 + 2 + 1 + 1) * 8
    (156 pigs, 1 * m) -> (78 pigs, 2 * m) -> (39 pigs, 4 * m) -> (20 pigs, 8 * m)
    if minutesToTest = 6 * m,
    first part take 4 * m, the second part take 2 * m, or first part take 2 * m, second part take 4 * m
    We need to reuse first part of pigs, so:
    (x pigs, 4 * m) + (x pigs, 2 * m) = n buckets

    generalize:
    minutesToTest p, minutesToDie m, buckets n

    p = 213, m = 11, n = 1234
    p = 19 * 11 + 4 >= (16 + 2 + 1) * 11
    n = 1234 = 1024 + 128 + 64 + 16 + 2 = round1[(64 + 2 + 0 + 0 + 0) * 16] + round2[(32 + 8 + 1) * 2] + round3[0 * 1]

    So the total pig is: 64 + 2 = 66
    need 16 + 2 + 0 = 18 * 11 = 198 mins

    ================================================================

    From multiplication point of view:

    From principle of multiplication without going though the recursive calculation.
    Note that during t tests, each pig has exactly t+1 possible different statuses:
    died at some Test#j (1<=j<=t) or still alive after all.
    So the maximum number of possible statuses of n pigs with t tests is straightforward:
    dp[n][t] = (t+1)^n.
    */
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        while (Math.pow((minutesToTest / minutesToDie + 1), pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}
