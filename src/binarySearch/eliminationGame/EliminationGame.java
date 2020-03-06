package binarySearch.eliminationGame;

public class EliminationGame {
    public static int lastRemaining(int n) {
        boolean l2r = true;
        int remaining = n;
        int head = 1;
        int step = 1;


        while(remaining > 1){
            if(l2r || remaining%2==1){
                head = head + step;
            }
            step = step*2;
            remaining = remaining/2;
            l2r = !l2r;

        }

        return head;

    }
}
