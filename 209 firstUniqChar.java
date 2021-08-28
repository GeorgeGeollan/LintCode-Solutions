public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
        HashMap<Character, Integer> countCharacter = new HashMap<>();

        char[] characters = str.toCharArray();

        int index = 0;

        for(char character: characters)
        {
            int count = countCharacter.getOrDefault(character, 0);
            count++;

            countCharacter.put(character, count);
        }

        for(char character: characters)
            if(countCharacter.get(character) == 1)
                return character;

        return ' ';
    }
}
