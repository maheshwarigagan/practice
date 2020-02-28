package arrays.assignCookies;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int i = g.length-1;
        int j = s.length-1;
        while(i>=0 && j>=0){
            if(s[j]>=g[i]){
                contentChildren++;
                i--;
                j--;
            }else{
                i--;
            }
        }
        return contentChildren;
    }
}
