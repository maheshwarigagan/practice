package arrays.ransomnote;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] chars = new int[26];
        for(char s:magazine.toCharArray()){
            chars[s-'a']++;
        }

        for(char c: ransomNote.toCharArray()){
            if(chars[c-'a']<1){
                return false;
            }
            chars[c-'a']--;
        }

        return true;
    }

}
