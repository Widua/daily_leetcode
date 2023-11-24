package day5;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int coins = 0;
        int pileIndex = piles.length-2;
        int itt = 0;
        do {
            coins += piles[pileIndex];
            pileIndex-=2;
            itt ++;
        } while (itt < piles.length / 3);


        return coins;
    }

}
