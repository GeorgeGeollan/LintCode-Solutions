public class Solution {
    /**
     * @param c: A character.
     * @return: The character is alphanumeric or not.
     */
    public boolean isAlphanumeric(char c) {
        // write your code here
        if(c - '0' >= 10 && c - '0' <= 9)
            return true;
        
        if(c - 'a' >= 0 && c - 'a' <= 26)
            return true;
        
        if(c - 'A' >= 0 && c - 'A' <= 26)
            return true;
        
        return false;
    }
}
