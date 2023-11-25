package day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAbsoluteDifferencesInSortedArrayTest {


    @Test
    public void typicalCase(){
        int[] response = SumOfAbsoluteDifferencesInSortedArray.getSumAbsoluteDifferences( new int[]{2,3,5} );

        assertArrayEquals(new int[]{4,3,5}, response);
    }

    @Test
    public void longArrayCase(){
        int[] response = SumOfAbsoluteDifferencesInSortedArray.getSumAbsoluteDifferences( new int[]{1,4,6,8,10} );

        assertArrayEquals(new int[]{24,15,13,15,21}, response);
    }


}