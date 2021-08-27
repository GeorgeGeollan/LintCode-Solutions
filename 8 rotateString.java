public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        int n = str.length;
        if(n <= 1)
            return;
            
        char[] rotate = new char[n];

        offset %= n;

        for(int i = 0; i < offset; i++)
            rotate[i] = str[n - offset + i];
        
        int count = 0;
        for(int i = offset; i < n; i++)
            rotate[i] = str[count++];

        for(int i = 0; i < n; i++)
            str[i] = rotate[i];
    }

}
