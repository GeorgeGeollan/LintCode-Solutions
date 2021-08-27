public class Solution {
    /**
     * @param size: An integer
     * @return: An integer list
     */
    public List<Integer> generate(int size) {
        // write your code here
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= size; i++)
            list.add(i);

        return list;
    }
}
