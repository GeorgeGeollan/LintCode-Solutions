public class Solution {
    /**
     * @param nums: the list of numbers
     * @return: return the maximum number.
     */
    public int maxNum(List<Integer> nums) {
        // write your code here
        int max = Integer.MIN_VALUE;

        for(int num: nums)
            if(max < num)
                max = num;

        return max;
    }
}
