package day7;

import java.util.Arrays;
import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> romanValues = new HashMap<>(){ {
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        } };
        int sum = 0;

        for (int i=0 ; i<s.length(); i++){
            int currLett = romanValues.get(s.charAt(i));
            if (i < s.length()-1){
                int nextLett = romanValues.get(s.charAt(i+1));

                if (nextLett > currLett){
                    sum -= currLett;
                    continue;
                }

            }
            sum += currLett;
        }


        return sum;
    }

}
