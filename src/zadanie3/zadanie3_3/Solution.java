package zadanie3.zadanie3_3;

import java.util.Arrays;

class Solution {
    public static void main (String [] args){
        int [] arr = {3, 1, 2, 4, 3};
        System.out.println(new Solution().solution(arr));
    }
    public int solution(int[] A) {
        if (A.length == 0)
            return 0;
        // write your code in Java SE 8
        int sum = Arrays.stream(A).sum();
        int leftSum = A[0];
        int rightSum = sum - A[0];
        int currLeft = leftSum;
        int currRight = rightSum;
        int P = Math.abs(leftSum - rightSum);
        for ( int i = 1; i < A.length -1; i++){
            currLeft += A[i];
            currRight -= A[i];
            if (Math.abs(currLeft - currRight) < P){
                P = Math.abs(currLeft - currRight);
            }
        }
        return P;
    }
}
