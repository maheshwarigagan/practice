package greedy.shortestwaystring;

public class ShortestWayToFormString {
    public static int shortestWay(String source, String target) {
        int count = 0;

        int current = 0;
        while(current < target.length()){
            int matched = current;


            for(int i=0;i<source.length();i++){
                if(current < target.length() && source.charAt(i) == target.charAt(current)){
                    current++;
                }
            }
            count++;

            if(matched  == current){
                return -1;
            }
        }

        return count;
    }
}
