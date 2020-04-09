package backspacestringcompare;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String S, String T) {
        return simplifyString(S).equals(simplifyString(T));
    }

    private static String simplifyString(String S){
        StringBuilder s = new StringBuilder();
        int i = 0;
        while(i<S.length()){
            char current = S.charAt(i);
            int len = s.length();
            if(current == '#' && len > 0){
                // get the character before this
                s.deleteCharAt(s.length()-1);
            }else if (current != '#'){
                s.append(current);
            }
            i++;
        }
        return s.toString();
    }
}
