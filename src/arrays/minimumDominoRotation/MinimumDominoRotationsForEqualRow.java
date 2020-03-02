package arrays.minimumDominoRotation;

public class MinimumDominoRotationsForEqualRow {
    public static int minDominoRotations(int[] A, int[] B) {
        int minSwaps = Math.min(numSwaps(A[0], A, B), numSwaps(B[0], A, B));
        minSwaps = Math.min(numSwaps(A[0], B, A),minSwaps);
        minSwaps = Math.min(numSwaps(B[0], B, A),minSwaps);
        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }
    private static int numSwaps(int target, int[] A, int[] B){
        int numSwaps = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] != target && B[i] != target){
                return Integer.MAX_VALUE;
            }else if(A[i] != target){
                numSwaps++;
            }
        }
        return numSwaps;
    }
}
