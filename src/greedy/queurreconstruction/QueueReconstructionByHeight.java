package greedy.queurreconstruction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionByHeight {
    public static int[][] reconstructQueue(int[][] people) {
        // for(int[] p: people){
        //     System.out.println(p[0]+" " +p[1]);
        // }
        // System.out.println("Hi");
        Arrays.sort(people, (o1, o2) -> (o1[0] == o2[0]) ? (o1[1] - o2[1]) : (o2[0] - o1[0]));
        // for(int[] p: people){
        //     System.out.println(p[0]+" " +p[1]);
        // }
        // System.out.println("Hi");

        List<int[]> output = new ArrayList<>();
        for(int[] p : people){
            output.add(p[1], p);
        }

        int n = output.size();
        return output.toArray(new int[n][2]);
    }

}
