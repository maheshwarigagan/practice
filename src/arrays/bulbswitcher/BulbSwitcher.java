package arrays.bulbswitcher;

public class BulbSwitcher {
    public static int numTimesAllBlue(int[] light) {
        int count = 0;
        int max = 0;
        long sum = 0;
        long sumExpected = 0;
        for(int i=0;i<light.length;i++){
            max = Math.max(max, light[i]);
            sum += (long)light[i];
            if(sum == ((long)max * (max + 1)) / 2)
                count++;
        }


        return count;
    }
}
