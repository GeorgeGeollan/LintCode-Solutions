public class Solution {
    /**
     * @param A: An integer
     * @return: a float number
     */
    public float maxOfArray(float[] A) {
        // write your code here
        float max = A[0];

        for(float a: A)
            if(max < a)
                max = a;

        return max;
    }
}
