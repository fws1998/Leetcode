public class Solution05 {
    public String longest(String s){
        if (s==null || s.length()==1){
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i=0; i<s.length(); i++){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start, end+1);
    }


    public int expand(String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public String longdp(String s){
        int len = s.length();

        if(len<2){
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];

        for (int i=0; i<len; i++){
            dp[i][i] = true;
        }

        char[] array = s.toCharArray();

        for (int L=2; L<len; L++){
            for (int i=0; i<len; i++){
                int j = L+i-1;
                if (j>=len){
                    break;
                }

                if (array[i]!=array[j]){
                    dp[i][j] = false;
                }else {
                    if (j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
