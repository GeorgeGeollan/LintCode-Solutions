public class Solution {
    /**
     * @param n: The number of digits
     * @return: All narcissistic numbers with n digits
     */
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        List<Integer> list = new ArrayList<>();

        if(n == 0)
            return list;

        for(int i = (int)(Math.pow(10, n - 1)) - 1; i < (int)(Math.pow(10, n)); i++)
        {
            int num = i;
            int sum = 0;

            while(num > 0)
            {
                int mod = num % 10;
                sum += (int)(Math.pow(mod, n));
                num /= 10;
            }

            if(i == sum)
                list.add(i);
        }

        return list;
    }
}
