package arrays.fruitinbasket;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static int totalFruit(int[] tree) {
        Map<Integer, Integer> map = new HashMap<>();

        int left=0, right = 0;
        int max = Integer.MIN_VALUE;

        while(right<tree.length){
            if(map.size()<=2){
                map.put(tree[right], right);
                right++;
            }
            if(map.size()>2){
                int minimum = tree.length-1;
                for(int value:map.values()){
                    if(value<minimum){
                        minimum = value;
                    }
                }
                map.remove(tree[minimum]);
                left = minimum+1;
            }
            max = Math.max(max,right-left);
        }

        return max;
    }

}
