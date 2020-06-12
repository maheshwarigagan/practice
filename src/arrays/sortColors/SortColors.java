package arrays.sortColors;

public class SortColors {

    public static void sortColors(int[] nums) {
        int zero_pointer = 0;
        int two_pointer = nums.length-1;
        int current = 0;
        while(current<=two_pointer){
            if(nums[current] == 0){
                swap(nums, zero_pointer, current);
                zero_pointer++;
                current++;
            }else if(nums[current] == 2){
                swap(nums, two_pointer, current);
                two_pointer--;
            }else{
                current++;
            }
        }
    }
    private static void swap(int[] nums, int pos_a, int pos_b){
        int temp = nums[pos_a];
        nums[pos_a] = nums[pos_b];
        nums[pos_b] = temp;
    }
}
