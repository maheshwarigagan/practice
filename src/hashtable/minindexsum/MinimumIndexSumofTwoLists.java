package hashtable.minindexsum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        populateMap(list1, map1);
        populateMap(list2, map2);
        List<String> answer = new ArrayList<>();

        int minimum = Integer.MAX_VALUE;
        for(String s: map1.keySet()){
            if(map2.containsKey(s)){
                int a = map1.get(s);
                int b = map2.get(s);
                if(a+b<minimum){
                    minimum = a+b;
                    answer = new ArrayList<>();
                    answer.add(s);
                }else if(a+b==minimum){
                    answer.add(s);
                }
            }
        }

        return answer.toArray(new String[0]);
    }
    private static void populateMap(String[] list, Map<String,Integer> map){
        for(int i=0;i<list.length;i++){
            map.put(list[i], i);
        }
    }
}
