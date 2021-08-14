public class Solution70 {
    public int climbStairs(int n) {
        int[] list = new int[2];
        list[0] = 1;
        list[1] = 1;
        for(int i=2; i<=n; i++){
            list[i%2] = list[0]+list[1];
        }
        return list[n%2];
    }
}
