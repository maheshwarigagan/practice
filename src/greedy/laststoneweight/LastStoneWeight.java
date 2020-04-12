package greedy.laststoneweight;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        // for(int stone: stones){
        //     pq.add(stone);
        // }
        // System.out.println(pq.peek());
        // while(pq.size()>=2){
        //     int x = pq.poll();
        //     int y = pq.poll();
        //     if(x>y){
        //         pq.add(x-y);
        //     }
        //     System.out.println(pq);
        // }
        // if(pq.size()==1){
        //     return pq.peek();
        // }else{
        //     return 0;
        // }


        // Performing bucket sort to solve this problem
        // creating buckets array of size 1001 since the weight of stones
        // should vary from 1 to 1000
        int[] buckets = new int[1001];
        for(int n:stones){
            buckets[n]++;
        }

        // Appointing two pointer approach to solve this
        int slow = buckets.length-1;

        while(slow > 0){
            // only caring about the buckets who have odd weights, since
            // buckets with even weight will destroy in pair wise order.

            if(buckets[slow]%2 != 0){
                // Now start iterating from fast = slow-1
                int fast = slow-1;
                // skip all the buckets which have zero weight
                while(fast > 0 && buckets[fast]==0){
                    fast--;
                }
                // if we reached the end of the array while doing this,
                // that means we couldn't find anything to match our slow with
                if(fast == 0){
                    break;
                }
                // fast will be destroyed(bucket with low weight)
                buckets[fast]--;
                // we gotta add a stone for the weight of slow-fast per the rules
                buckets[slow-fast]++;
            }
            slow--;
        }
        return slow;
    }

}
