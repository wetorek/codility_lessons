package zadanie4.zadanie4_2;
//https://www.youtube.com/watch?v=CZlzQjg-0CM&list=PLBhZoc-DOzJHCtgnAgYFgMY33Kqjul2bc&index=8
public class Source {
    public int solution(int[] A) {
        boolean [] result = new boolean[A.length];
        for ( int i = 0; i < A.length; i++){
            if (A[i] > A.length)
                return 0;
            result[A[i] - 1] = true;
        }
        for ( int i = 0; i < result.length; i++){
            if (result[i] == false)
                return 0;
        }
        return 1;
    }
}
