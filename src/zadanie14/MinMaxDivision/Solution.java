package zadanie14.MinMaxDivision;

class Solution {
    public int solution(int K, int M, int[] A) {
        int biggerstVal = 0;
        int sum = 0;
        for ( int i : A){
            sum += i;
            biggerstVal = Math.max(i, biggerstVal);
        }
        int temp = sum;
        while (biggerstVal <= sum){
            int mid = (biggerstVal + sum)/2;
            if (isPossible(mid, K-1, A)){
                sum = mid - 1;
                temp = mid;
            }
            else {
                biggerstVal = mid + 1;
            }
        }
        return temp;
    }
    private boolean isPossible ( int mid, int k, int [] A){
        int sum = 0;
        for ( int i = 0; i < A.length; i++){
            sum += A[i];
            if (sum > mid){
                sum = A[i];
                k--;
            }
            if (k < 0)
                return false;
        }
        return true;
    }
}