package day3;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int i =0, j=0;
        int minMatching = Integer.MAX_VALUE;
        long sum = nums[0];

        while (i < nums.length && j < nums.length) {
            if ( sum < target && j+1 < nums.length ){
                sum += nums[j+1];
                j++;
            }
            else if (sum >= target){
                minMatching = Math.min(minMatching, (j - i) + 1 );
                sum -= nums[i];
                i++;
            }else {
                break;
            }
        }

        if (sum < target && i == 0) return 0;

        return minMatching;
    }

}
