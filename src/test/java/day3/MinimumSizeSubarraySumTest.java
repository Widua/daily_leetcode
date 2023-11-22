package day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    @Test
    public void typicalCase(){
        int response = MinimumSizeSubarraySum.minSubArrayLen(7,new int[]{2,3,1,2,4,3});

        assertEquals(2,response);
    }

    @Test
    public void thereIsNoSubarray(){
        int response = MinimumSizeSubarraySum.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1});

        assertEquals(0,response);
    }


}