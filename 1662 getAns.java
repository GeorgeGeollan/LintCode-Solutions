public class Solution {
    /**
     * @param a: the array a
     * @return: return the index of median
     */
    public int getAns(int[] a) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; i++)
            map.put(a[i], i);

        Arrays.sort(a);

        int n = a.length;

        return n % 2 == 1 ? map.get(a[n / 2]) : map.get(a[n / 2 - 1]);
    }
}
