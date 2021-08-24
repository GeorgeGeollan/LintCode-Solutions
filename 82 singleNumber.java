public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        int count = 1;
        Arrays.sort(A);

        for(int i = 1; i < A.length; i++)
        {
            if(A[i] == A[i - 1])
                count++;
            
            else if(count == 2 && A[i] != A[i - 1])
                count = 1;
            
            else
                return A[i - 1];
        }

        return A[A.length - 1];
    }
}
