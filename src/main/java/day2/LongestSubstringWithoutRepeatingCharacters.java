package day2;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        String testedString = "";

        int maxLen = -1;

        if (s.isEmpty()) return 0;
        else if (s.length() == 1) return 1;

        for (char c : s.toCharArray()) {
            String currentCharacter = String.valueOf(c);

            if (testedString.contains(currentCharacter)){
                testedString = testedString.substring(testedString.indexOf(currentCharacter)+1);
            }
            testedString = testedString + currentCharacter;
            maxLen = Math.max(testedString.length(),maxLen);
        }
        return maxLen;
    }


}
