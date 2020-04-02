package A1.basic;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by yaoyao on 2020/4/2
 * Description:
 */
public class Drawtest {
    public static void main(String[] args) {
        int n = 1000;
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.setPenRadius(0.1);
        for (int i = 1; i <= n; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i);
            StdDraw.point(i, i * Math.log(i));
        }
    }
}
