public class Solution1 {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        int count = 1;
        Arrays.sort(A);

        for(int i = 1; i < A.length; i++)
        {
            if(A[i] == A[i - 1])
                count++;
            
            else if(count == 2 && A[i] != A[i - 1])
                count = 1;
            
            else
                return A[i - 1];
        }

        return A[A.length - 1];
    }
}

public class Solution2 {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        HashSet<Integer> set = new HashSet<>();

        for(int a: A)
        {
            if(set.contains(a))
                set.remove(a);
            else
                set.add(a);
        }

        return set.iterator().next();
    }
}

public class Solution3 {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        int num = 0;

        for(int a: A)
            num ^= a;

        return num;
    }
}
