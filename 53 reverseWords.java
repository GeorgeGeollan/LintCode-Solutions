public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
     public String reverseWords(String s) {
       s.trim();

       String[] words = s.split(" ");
       StringBuilder sb = new StringBuilder();

       for(int i = words.length - 1; i >= 0; i--)
       {
           if(words[i].equals(""))
               continue;

            sb.append(" " + words[i]);
       }

       return sb.toString().trim();
    }
}
