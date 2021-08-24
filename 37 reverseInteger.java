public class Solution1 {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int reverseNumber = 0;

        while(number > 0)
        {
            reverseNumber *= 10;
            int digit = number % 10;
            reverseNumber += digit;
            number /= 10;
        }

        return reverseNumber;
    }
}

public class Solution2 {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        StringBuilder sb = new StringBuilder();

        sb.append(String.valueOf(number));
        sb.reverse();

        return Integer.valueOf(sb.toString());
    }
}
