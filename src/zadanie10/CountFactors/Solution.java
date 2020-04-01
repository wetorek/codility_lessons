package zadanie10.CaountFactors;

class Solution {
    public int solution(int N) {
        if ( N == 1)
            return 1;
        int ctr = 0;
        int i = 1;
        int sqrt = (int) Math.sqrt(N);
        while ( i <= sqrt){
            if (N % i == 0)
                ctr += 2;
            i++;
        }
        if (sqrt * sqrt == N)
            ctr--;
        return ctr;
    }
}
