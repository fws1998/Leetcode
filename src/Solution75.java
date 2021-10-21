public class Solution75 {
    public void sortColors(int[] nums){
        int n = nums.length;
        if (n>=2){
            int p0 = 0;
            int p2 = n-1;
            for (int i=0; i<=p2; i++){
                if (nums[i] == 0){
                    int temp = nums[i];
                    nums[i] = nums[p0];
                    nums[p0] = temp;
                    p0++;
                }
                while (i<=p2 && nums[i]==2){
                    int temp = nums[i];
                    nums[i] = nums[p2];
                    nums[p2] = temp;
                    p2--;
                }
            }
        }
    }
}
