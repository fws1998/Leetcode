import java.util.ArrayList;
import java.util.HashMap;

public class Solution560 {
    public int sun(int[] nums, int k){
        int count = 0;
        for (int start=0; start<nums.length; start++){
            int sum = 0;
            for (int end=start; end>=0; end--){
                sum += nums[end];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public int sub(int[] nums, int k){
        int count = 0;
        int pre = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0; i<nums.length; i++){
            pre += nums[i];
            if (map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre, map.getOrDefault(pre, 0)+1);
            ArrayList<Node> arrayList = new ArrayList<>();
        }
        return count;
    }

}


