public class Solution {
    /**
     * @param year: a number year
     * @param month: a number month
     * @return: Given the year and the month, return the number of days of the month.
     */
    public int getTheMonthDays(int year, int month) {
        // write your code here
        if(((year % 400 == 0 )||(year % 4 == 0 && year % 100 != 0)) && month == 2)
            return 29;
            
        else
        {
            if(month == 2)
                return 28;
            
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                return 31;

            return 30;
        }

    }
}
