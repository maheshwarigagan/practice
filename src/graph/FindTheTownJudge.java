package graph;

// https://leetcode.com/problems/find-the-town-judge/
public class FindTheTownJudge {
    public static int findJudge(int N, int[][] trust) {
        int[] votesReceived  = new int[N+1];
        int[] votedFor = new int[N+1];
        for(int i=0;i<trust.length;i++){
            votesReceived[trust[i][1]]++;
            votedFor[trust[i][0]]++;
        }
        for(int i=1;i<N+1;i++){
            if(votedFor[i] == 0 && votesReceived[i] == N-1){
                return i;
            }
        }
        return -1;
    }
}
