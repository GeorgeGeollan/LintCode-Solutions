public class Solution {
    /**
     * @param num1: An integer
     * @param num2: An integer
     * @param num3: An integer
     * @return: an interger
     */
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here

        int larger = num1 > num2 ? num1 : num2;
        return larger > num3 ? larger : num3;
    }
}
