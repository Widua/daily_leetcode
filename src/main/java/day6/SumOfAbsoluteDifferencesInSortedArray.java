package day6;

import java.util.Arrays;

public class SumOfAbsoluteDifferencesInSortedArray {

    public static int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int sumL = 0;
        int sumR = Arrays.stream(nums).sum();

        for( int i=0 ; i< n; i++ ){
            sumR -= nums[i];

            int prefix = i * nums[i];
            int suffix = nums[i] * ( n - 1 - i);

            res[i] = prefix - sumL + sumR - suffix;
            sumL += nums[i];
        }


        return res;
    }

}
