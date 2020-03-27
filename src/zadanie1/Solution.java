package zadanie1;
class Solution {
    public static void main (String [] args){
        Solution s = new Solution();
        System.out.println(s.solution(32));
    }
    /*public int solution(int N) {
        String binaryRepresentation = Integer.toBinaryString(N);
        // write your code in Java SE 11
        int modifier = 0;
        if (binaryRepresentation.endsWith("0")){
            modifier = 1;
        }
        String [] split = binaryRepresentation.split("1");
        int max = 0;
        for (int i = 0; i < split.length - modifier; i++) {
            int length = split[i].length();
            if ( length > max)
                max = length;
        }
        return max;
    }*/
    public int solution ( int N){
        int counter = 0;
        while(true){
            if ((Math.pow(2, counter)) > N)
                break;
            counter++;
        }
        counter--;
        int maxGap = 0;
        int gap = 0;
        int numberLeft = N;
        while ( numberLeft > 0){
            if ((Math.pow(2, counter)) <= numberLeft){
                numberLeft -= Math.pow(2, counter);
                if (gap > maxGap)
                    maxGap = gap;
                gap = 0;
            }else {
                gap++;
            }
            counter--;
        }
        return maxGap;
    }
}
