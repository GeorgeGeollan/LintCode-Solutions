public class Solution {
    /**
     * @param array: the input array
     * @return: the sorted array
     */
    public int[][] multiSort(int[][] array) {
        // Write your code here
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i][1] < array[j][1])
                {
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

                if(array[i][1] == array[j][1])
                {
                    if(array[i][0] > array[j][0])
                    {
                        int[] temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }
}
