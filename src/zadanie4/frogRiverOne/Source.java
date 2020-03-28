package zadanie4.zadanie4_1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for ( int i = 0; i < A.length; i++){
            if (A[i] <= X){
                if (!set.contains(A[i]))
                    set.add(A[i]);
                if (set.size() == X)
                    return i;
            }
        }
        return -1;
    }
}
