package hashtable.groupanagrams;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            // convert input string to char array
            char[] tempArray = str.toCharArray();

            // sort tempArray
            Arrays.sort(tempArray);

            // return new sorted string
            String sorted = new String(tempArray);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        List<List<String>> output = new ArrayList<>(map.values());
        return output;
    }
}
