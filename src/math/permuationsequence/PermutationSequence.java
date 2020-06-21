package math.permuationsequence;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public static String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();

        int current_n = n;
        List<Integer> nums = new ArrayList<>();
        for(int i =1; i<=n; i++){
            nums.add(i);
        }
        int current_k = k-1;
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = 1;
        for(int i=1; i<=n; i++){
            sum *= i;
            factorial[i] = sum;
        }
        while(sb.length()<n){

            int choice_index  = helper(current_n, current_k, factorial);
            sb.append(nums.get(choice_index));
            nums.remove(choice_index);
            current_n = current_n - 1;
            if(choice_index != 0){
                current_k =((current_k) % (factorial[current_n]*choice_index));
            }

        }

        return sb.toString();

    }

    private static int helper(int n, int k, int[] factorial){
        if(n==1){
            return 0;
        }
        int fact = factorial[n-1];
        return k/fact;

    }

}
