public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        HashSet set = new HashSet<>();
        int index = 0;

        for(int num: nums)
        {
            if(!set.contains(num))
                nums[index++] = num;

            set.add(num);
        }
            
        return set.size();
    }
}
