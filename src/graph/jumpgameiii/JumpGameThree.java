package graph.jumpgameiii;

public class JumpGameThree {

    public static boolean canReach(int[] arr, int st) {
//         Set<Integer> visited = new HashSet<>();
//         Queue<Integer> q = new LinkedList<>();
//         q.offer(start);
//         while(!q.isEmpty()){
//             int current = q.poll();
//             if(arr[current] == 0){
//                 return true;
//             }
//             if(visited.contains(current)){
//                 continue;
//             }
//             visited.add(current);
//             if(current + arr[current] < arr.length){
//                 q.offer(current + arr[current]);
//             }
//             if(current - arr[current] >= 0){
//                 q.offer(current - arr[current]);
//             }

//         }
//         return false;

        if (st >= 0 && st < arr.length && arr[st] < arr.length) {
            //
            int jump = arr[st];
            // this will help us not revisit this element again and again
            arr[st] += arr.length;

            return jump == 0 || canReach(arr, st + jump) || canReach(arr, st - jump);
        }
        return false;
    }


}
