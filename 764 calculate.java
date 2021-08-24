public class Solution {
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public static final double PI = 3.14;

    public double[] calculate(int r) {
        
        // write your code here
        double[] info = new double[2];

        info[0] = PI * 2 * r;
        info[1] = PI * r * r;

        return info;
    }
}
