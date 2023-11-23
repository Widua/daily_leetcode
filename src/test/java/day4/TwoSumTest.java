package day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void typicalCase(){
        int[] response = TwoSum.twoSum( new int[]{2,7,11,15},9 );

        assertArrayEquals( new int[]{0,1},response );
    }

    @Test
    public void responseInTheMiddleCase(){
        int[] response = TwoSum.twoSum( new int[]{3,2,4},6 );

        assertArrayEquals( new int[]{1,2},response );
    }


}