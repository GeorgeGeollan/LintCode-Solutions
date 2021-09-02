public class Solution {
    /**
     * @param Matrix: the input
     * @return: the element which appears every row
     */
    public int FindElements(int[][] Matrix) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < Matrix.length; i++)
        {
            for(int j = 0; j < Matrix[0].length; j++)
            {
                count = map.getOrDefault(Matrix[i][j], 0);
                count++;


                if(count == Matrix.length)
                    return Matrix[i][j];

                map.put(Matrix[i][j], count);
            }
        }

        return -1;
    }
}
