package zadanie7;

import java.util.Stack;

class Solution {
    /*public static void main (String [] args){
        var t = new Solution().solution("{[()()]}");
    }*/
    public int solution(String S) {
        if (S.length() == 0)
            return 1;
        Stack<Character> s = new Stack<>();
        for ( int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if ( c == '(' || c == '{' || c == '[')
                s.addElement(c);
            else if (c == ')' || c == '}' || c == ']'){
                if (s.isEmpty())
                    return 0;
                char t = s.pop();
                if ( c == ')'&& t != '(')
                    return 0;
                if ( c == ']'&& t != '[')
                    return 0;
                if ( c == '}'&& t != '{')
                    return 0;
            }
        }
        if (s.isEmpty())
            return 1;
        return 0;
    }
}
