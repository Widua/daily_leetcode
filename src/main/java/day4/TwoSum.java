package day4;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valIndexMap = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++ ) {
            if(valIndexMap.containsKey(target - nums[i])){
                return new int[]{valIndexMap.get(target-nums[i]) , i };
            } else {
                valIndexMap.put(nums[i], i );
            }
        }

        return new int[]{};
    }

}
