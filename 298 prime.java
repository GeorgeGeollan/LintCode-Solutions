public class Solution {
    /**
     * @param n: an integer
     * @return: return all prime numbers within n.
     */
    public List<Integer> prime(int n) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        boolean isPrime = true;

        if(n <= 1)
            return list;

        for(int i = 2; i <= n; i++)
        {
            for(int j = 2; j <= (int)(Math.sqrt(i)); j++)
            {
                if(i % j == 0)
                    isPrime = false;
            }

            if(isPrime == true)
                list.add(i);

            isPrime = true;
        }

        return list;
    }
}
