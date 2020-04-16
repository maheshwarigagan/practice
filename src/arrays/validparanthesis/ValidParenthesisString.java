package arrays.validparanthesis;

import java.util.Stack;

public class ValidParenthesisString {
    public static boolean checkValidString(String s) {
        Stack<Integer> leftIndex = new Stack<>();
        Stack<Integer> starIndex = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                leftIndex.push(i);
            }else if(c=='*'){
                starIndex.push(i);
            }else{
                if(!leftIndex.isEmpty()){
                    leftIndex.pop();
                }else if(!starIndex.isEmpty()){
                    starIndex.pop();
                }else{
                    return false;
                }
            }
        }

        while(!leftIndex.isEmpty() && !starIndex.isEmpty()){
            if(leftIndex.pop()>starIndex.pop()){
                return false;
            }
        }
        return leftIndex.isEmpty();
    }
}
