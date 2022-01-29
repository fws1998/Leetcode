public class Solution43 {
    public String numtiply(String num1, String num2){
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int[] result = new int[num1.length()+num2.length()];

        for (int i=num1.length()-1; i>=0; i--){
            int n1 = num1.charAt(i)-'0';
            for (int j=num2.length()-1; j>=0; j--){
                int n2 = num2.charAt(j)-'0';
                int sum = (result[i+j+1]+n1*n2);
                result[i+j+1] = sum%10;
                result[i+j] = sum / 10;
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i=0; i<result.length; i++){
            res.append(result[i]);
        }
        return res.toString();
    }
}
