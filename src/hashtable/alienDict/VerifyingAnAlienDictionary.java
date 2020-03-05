package hashtable.alienDict;

public class VerifyingAnAlienDictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        int[] dictionary = new int[26];
        for(int i=0;i<26;i++){
            dictionary[order.charAt(i)-'a'] = i;
        }

        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){

                int minLength = Math.min(words[i].length(),words[j].length());
                for(int k=0;k<minLength;k++){
                    int i_order = dictionary[words[i].charAt(k)-'a'];
                    int j_order = dictionary[words[j].charAt(k)-'a'];
                    if(i_order<j_order){
                        break;
                    }else if(j_order<i_order){
                        return false;
                    }else if(k == minLength-1 && words[i].length()>words[j].length()){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
