public class Solution58 {
    public int lengthOfLastWord(String s) {
        short len = (short)(s.length()-1);
        while(len>=0 && s.charAt(len)==' '){
            len--;
        }
        if(len<0){
            return 0;
        }
        short start = len;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return len - start;
    }
}
