package arrays.jumpgame;

public class JumpGame {
    State[] memo;
    public boolean canJump(int[] nums) {
        memo = new State[nums.length];
        for(int i=0;i<nums.length-1;i++){
            memo[i] = State.UNKNOWN;
        }
        memo[nums.length-1] = State.GOOD;
        return canTraverse(0,nums);
    }

    private boolean canTraverse(int pos, int[] nums){
        if(memo[pos] != State.UNKNOWN){
            return memo[pos] == State.GOOD;
        }

        int farthestJump = Math.min(nums.length-1, pos+nums[pos]);
        for(int i=pos+1;i<=farthestJump;i++){
            if(canTraverse(i, nums)){
                memo[i] = State.GOOD;
                return true;
            }
        }
        memo[pos] = State.BAD;
        return false;
    }

}

enum State{
    UNKNOWN, GOOD, BAD
}