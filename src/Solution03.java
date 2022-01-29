import java.util.HashSet;
import java.util.Set;

public class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int right = -1;
        int length = 0;

        for (int i=0; i<n; i++){
            if (i!=0){
                set.remove(s.charAt(i-1));
            }

        }

        return length;
    }
}
