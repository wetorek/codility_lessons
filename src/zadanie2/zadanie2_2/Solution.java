package zadanie2.zadanie2_2;

 class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length <= 1)
            return A;
        K = K % A.length;
        for ( int i = 0; i < K; i++){
            int keeper = A[A.length - 1];;
            for ( int j = A.length - 1; j > 0; j--)
                A[j] = A[j-1];
            A[0] = keeper;
        }
        return A;
    }
}
