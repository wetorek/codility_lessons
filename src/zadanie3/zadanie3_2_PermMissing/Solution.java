package zadanie3.zadanie3_2;

public class Solution {
    public int solution (int []A){
        boolean[] result = new boolean[A.length + 1];
        for ( int i = 0; i < A.length; i++){
            result[A[i] - 1] = true;
        }
        for ( int i = 0; i < result.length; i++){
            if (!result[i]) {
                return i+1;
            }
        }
        return 0;
    }
}
