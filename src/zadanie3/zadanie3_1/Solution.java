package zadanie3.zadanie3_1;

class Solution {
    public int solution(int X, int Y, int D) {
        if (X == Y)
            return 0;
        int dist  = Y- X;
        if (dist % D == 0)
            return dist / D;
        else
            return (dist/D) +1;
    }
}
