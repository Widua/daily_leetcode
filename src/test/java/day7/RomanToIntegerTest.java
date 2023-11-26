package day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    public void typicalCase(){
        int convInt = RomanToInteger.romanToInt("III");

        assertEquals(3,convInt);
    }

    @Test
    public void minusNumberCase(){
        int convInt = RomanToInteger.romanToInt("IX");

        assertEquals(9,convInt);
    }

}