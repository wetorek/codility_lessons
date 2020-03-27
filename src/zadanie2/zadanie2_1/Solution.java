package zadanie2_1;

import java.util.HashSet;
//https://www.youtube.com/watch?v=thpS8uwAwD0&list=PLBhZoc-DOzJHCtgnAgYFgMY33Kqjul2bc&index=2

public class Solution {
    public static void main (String [] args){

    }
    public int solution1(int[] A) {
        HashSet<Integer> ints = new HashSet<>();
        for ( int i : A){
            if (!ints.contains(i))
                ints.add(i);
            else
                ints.remove(i);
        }
        for ( int a : ints){
            return a;
        }
        return 0;
    }


}
