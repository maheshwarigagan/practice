package arrays.stringshift;

public class PerformStringShifts {
    public static String stringShift(String s, int[][] shift) {
        int leftCount = 0;
        int rightCount = 0;
        for(int[] sh:shift){
            if(sh[0] == 1){
                rightCount += sh[1];
            }else{
                leftCount += sh[1];
            }
        }
        int count = rightCount - leftCount;
        count = count%s.length();
        StringBuilder output = new StringBuilder();
        if(count > 0){
            output.append(s.substring(s.length()-count, s.length()));
            output.append(s.substring(0, s.length()-count));
        }else if(count<0){
            count = -count;
            output.append(s.substring(count, s.length()));
            output.append(s.substring(0, count));

        }

        return count == 0?s :output.toString();
    }
}
