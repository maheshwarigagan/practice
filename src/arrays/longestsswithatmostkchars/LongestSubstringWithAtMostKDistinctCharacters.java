package arrays.longestsswithatmostkchars;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
//         int count = 0;
//         if(s.isEmpty() || k==0){
//             return 0;
//         }
//         int left=0, right=0;
//         Map<Character, Integer> map = new HashMap<>();

//         while(right < s.length()){

//             map.put(s.charAt(right), right);
//             right++;
//             //Remove the smallest entry
//             if(map.size()==k+1){
//                 int index = Collections.min(map.values());
//                 map.remove(s.charAt(index));
//                 left = index+1;
//             }

//             count = Math.max(count, right-left);

//         }


//         return count;

        int n = s.length();
        if(n*k == 0){
            return 0;
        }

        int left = 0, right = 0;
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        int max_len = 1;

        while(right < n){
            Character current = s.charAt(right);
            lhm.remove(current);
            lhm.put(current, right);
            right++;
            //remove the leftmost entry
            if(lhm.size() == k+1){
                Map.Entry<Character, Integer> entry = lhm.entrySet().iterator().next();
                lhm.remove(entry.getKey());
                left = entry.getValue()+1;
            }
            max_len = Math.max(max_len, right-left);
        }

        return max_len;
    }

}
