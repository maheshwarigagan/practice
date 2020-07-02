package dynamicProgramming.partitionEqualSubsetSum;

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {

        int sum = 0;

        for(int n:nums){
            sum += n;
        }

        if(sum % 2 != 0){
            return false;
        }
        int expected_sum = sum/2;
        boolean[][] dp = new boolean[nums.length+1][expected_sum+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j] = false;
                }
                if(j==0){
                    dp[i][j] = true;
                }
                // System.out.print(dp[i][j]);
            }
            // System.out.println(" ");
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j >= nums[i-1]){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                // System.out.print(dp[i][j]);
            }
            // System.out.println(" ");
        }
        return dp[nums.length][expected_sum];

    }

}
