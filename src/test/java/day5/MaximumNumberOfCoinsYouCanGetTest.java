package day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfCoinsYouCanGetTest {

    @Test
    public void onePileTest(){

        int coins = MaximumNumberOfCoinsYouCanGet.maxCoins(new int[]{2,4,5});

        assertEquals(4,coins);
    }

    @Test
    public void manyPilesTest(){
        int coins = MaximumNumberOfCoinsYouCanGet.maxCoins(new int[]{9,8,7,6,5,1,2,3,4});

        assertEquals(18,coins);
    }
}