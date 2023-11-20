package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void typicalCase(){
        int[] result = MergeSortedArray.merge( new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3 );

        assertArrayEquals(new int[]{1,2,2,3,5,6},result);
    }

    @Test
    public void secondTableEmpty(){
        int[] result = MergeSortedArray.merge( new int[]{1},1,new int[]{},0 );

        assertArrayEquals(new int[]{1},result);
    }

    @Test
    public void firstTableEmpty(){
        int[] result = MergeSortedArray.merge( new int[]{0},0,new int[]{1},1 );

        assertArrayEquals(new int[]{1},result);
    }

    @Test
    public void mergeOrdered(){
        int[] result = MergeSortedArray.merge(new int[]{1,2,3,0,0,0},3,new int[]{4,5,6},3);
        assertArrayEquals(new int[]{1,2,3,4,5,6},result);
    }


}