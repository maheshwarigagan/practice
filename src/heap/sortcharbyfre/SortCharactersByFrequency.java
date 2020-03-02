package heap.sortcharbyfre;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        if(s == null || s.length()==0){
            return sb.toString();
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for(char c: s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> countMap.get(b) - countMap.get(a));

        maxHeap.addAll(countMap.keySet());


        while(!maxHeap.isEmpty()){
            char current = maxHeap.poll();
            int count = countMap.get(current);
            for(int i=0;i<count;i++){
                sb.append(current);
            }

        }
        return sb.toString();
    }
}
