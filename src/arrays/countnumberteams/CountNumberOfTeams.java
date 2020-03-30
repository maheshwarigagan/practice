package arrays.countnumberteams;

public class CountNumberOfTeams {
    public static int numTeams(int[] rating) {
        int count = 0;
        int len = rating.length;

        for(int j=0;j<len;j++){
            int leftLarger = 0, rightLarger = 0, leftSmaller = 0, rightSmaller = 0;
            // left side
            for(int i=0;i<j;i++){
                if(rating[i]<rating[j]){
                    leftSmaller++;
                }else if(rating[i]>rating[j]){
                    leftLarger++;
                }
            }

            // right side
            for(int k=j+1;k<len;k++){
                if(rating[k]<rating[j]){
                    rightSmaller++;
                }else if(rating[k]>rating[j]){
                    rightLarger++;
                }
            }
            count += leftSmaller * rightLarger + leftLarger*rightSmaller;
        }
        return count;
    }

}
