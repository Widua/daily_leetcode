package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void typicalCase(){
        int len = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");

        assertEquals(3,len);
    }

    @Test
    public void stringContainsOnlyOneLetter(){
        int len = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbb");

        assertEquals(1,len);
    }

    @Test
    public void substringInTheMiddle(){
        int len = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");

        assertEquals(3,len);
    }

}