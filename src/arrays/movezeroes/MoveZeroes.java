package arrays.movezeroes;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int n:nums){
            if(n != 0){
                nums[index] = n;
                index++;
            }
        }
        while(index<nums.length){
            nums[index] = 0;
            index++;
        }
    }
}
