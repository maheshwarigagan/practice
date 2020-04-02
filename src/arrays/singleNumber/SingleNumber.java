package arrays.singleNumber;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        // Map<Integer, Integer> countMap = new HashMap<>();
        // for(int n:nums){
        //     countMap.put(n, countMap.getOrDefault(n,0)+1);
        // }
        // for(int n:nums){
        //     if(countMap.get(n) == 1){
        //         return n;
        //     }
        // }
        // return -1;

        // XOR operation works like this:
        // a xor 0 will give us a
        // a xor a will give us 0
        // so if we xor all the numbers, the number left behind will be our answer.

        int answer = 0;

        for(int n:nums){
            answer ^= n;
        }

        return answer;

    }

}
