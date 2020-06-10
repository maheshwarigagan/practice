package greedy.subsequence;

public class IsSubsequence {
//    Recursive
//     public boolean isSubsequence(String s, String t) {
//         return helper(s, t, 0, 0);
//     }
//
//     private boolean helper(String s, String t, int s_index, int t_index){
//
//         if(s_index == s.length()){
//             return true;
//         }
//         if(t_index == t.length()){
//             return false;
//         }
//
//         if(s.charAt(s_index) == t.charAt(t_index)){
//             s_index++;
//         }
//         t_index++;
//
//         return helper(s, t, s_index, t_index);
//
//     }

    // iterative
    public static boolean isSubsequence(String s, String t) {
        int s_p = 0, t_p = 0;
        while(s_p < s.length() && t_p < t.length()){
            if(s.charAt(s_p) == t.charAt(t_p)){
                s_p++;
            }
            t_p++;
        }
        return s_p == s.length();
    }

}
