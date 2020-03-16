package arrays.palindromicsubstring;

public class PalindromicSubstring {

    public static int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            count += findPalindrome(s, i, i);
            count += findPalindrome(s, i, i+1);
        }
        return count;
    }

    private static int findPalindrome(String s, int left, int right){
        int count = 0;
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }


}
