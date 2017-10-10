package DP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Chris on 10/10/17.
 */
public class Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        int i, j;

        for (i = n - 1; i >= 0; i--) {
            for (j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
                for(int k = 0; k < dp.length; k++) {
                    System.out.print(" Dp[" + k + "] : " + dp[k]);
                }
                System.out.println(" i:" + i + " j:" + j);
            }
        }




        return dp[0];
    }

    public static void main (String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>(Arrays.asList(-1)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(2, 3)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(1, -1, -3)));
//        triangle.add(new ArrayList<Integer>(Arrays.asList(5, 3, -1, 2)));

        int res = minimumTotal(triangle);

        System.out.print(res);
    }


//           -1
//            2,  3
//            1, -1, -3
//            0,  0,  0, 0
//
//
//            1, -1, -3, 0
//            1,  0, -3, 0
//           -1,  0, -3, 0

}
