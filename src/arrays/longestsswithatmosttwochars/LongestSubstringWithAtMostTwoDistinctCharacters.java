package arrays.longestsswithatmosttwochars;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int left=0, right = 0;
        int max = Integer.MIN_VALUE;

        while(right<s.length()){
            if(map.size()<=2){
                map.put(s.charAt(right), right);
                right++;
            }
            if(map.size()>2){
                int minimum = s.length()-1;
                for(int value:map.values()){
                    if(value<minimum){
                        minimum = value;
                    }
                }
                map.remove(s.charAt(minimum));
                left = minimum+1;
            }
            max = Math.max(max,right-left);
        }

        return s.isEmpty()?0:max;
    }
}
