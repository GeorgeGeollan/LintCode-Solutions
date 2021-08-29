public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        for(int i = 0; ; i++)
        {
            for(int j = 0; ; j++)
            {
                if(j == target.length())
                    return i;
                
                if(i + j == source.length())
                    return -1;

                if(source.charAt(i + j) != target.charAt(j))
                    break;
            }
        }
    }
}
