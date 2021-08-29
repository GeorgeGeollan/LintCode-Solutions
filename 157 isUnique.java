public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        HashSet<Character> set = new HashSet<>();

        char[] words = str.toCharArray();

        for(int i = 0; i < words.length; i++)
        {
            if(set.contains(words[i]))
                return false;

            set.add(words[i]);
        }

        return true;
    }
}
