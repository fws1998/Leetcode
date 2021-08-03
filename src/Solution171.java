public class Solution171 {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(short i =0; i<columnTitle.length(); i++){
            res = res*26 +columnTitle.charAt(i) -64;
        }
        return res;
    }
}
