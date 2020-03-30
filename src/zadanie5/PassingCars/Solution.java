package zadanie5;

public class Solution {
    public int solution(int[] A) {
        if ( A.length <=1)
            return 0;
        int [] onesCounter = new int[A.length];
        int numberOfPairs = 0;
        int currNumberOfFollowingCars = 0;
        for ( int i = A.length-1; i >= 0; i--){
            if (A[i] == 1)
                currNumberOfFollowingCars++;
            onesCounter[i] = currNumberOfFollowingCars;
        }
        for ( int i = A.length-1;i >= 0; i--){
            if (A[i] == 0)
                numberOfPairs += onesCounter[i];
            if (numberOfPairs > 1000000000)
                return -1;
        }
        return numberOfPairs;
        // write your code in Java SE 11
    }
}
