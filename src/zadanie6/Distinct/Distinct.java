package zadanie6;

import zadanie2.zadanie2_1.Solution;

import java.util.Arrays;

class Solution {
    public static void main (String [] args){
        new Solution().solution({});
    }
    public int solution(int[] A) {
        Arrays.sort(A);
        int different = 0;
        int i = 0;
        int j = 1;
        while (j < A.length){
            if (A[i] != A[j]){
                different++;
                i = j;
                j++;
            }
            else{
                while (j < A.length -1  && A[j] == A[j+1])
                    j++;

            }
        }
        return different;
    }
}
