package arrays.maxLengthConcatenatedString;

import java.util.ArrayList;
import java.util.List;

public class MaximumLengthConcatenatedStringUniqueCharacters {
    public static int maxLength(List<String> arr) {
        int result = 0;
        List<String> res = new ArrayList<>();
        res.add("");
        for(String s:arr){
            if(!isUnique(s)){
                continue;
            }
            List<String> resList = new ArrayList<>();
            for(String x : res){
                StringBuilder sb = new StringBuilder();
                sb.append(x);
                sb.append(s);
                if(isUnique(sb.toString())){
                    resList.add(sb.toString());
                }
            }
            res.addAll(resList);
        }

        for(String x:res){
            result = Math.max(result, x.length());
        }
        return result;
    }

    private static boolean isUnique(String s){
        char[] alphabets = new char[26];
        for(char c: s.toCharArray()){
            if(alphabets[c-'a']>0){
                return false;
            }
            alphabets[c-'a']++;
        }
        return true;
    }
}