import java.util.List;

public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] list = new int[triangle.size()];
        list[0] = triangle.get(0).get(0);
        for (short i = 1; i < triangle.size(); i++) {
            list[i] = list[i - 1] + triangle.get(i).get(i);//最右边
            for (short j = (short) (i - 1); j > 0; j--) {
                list[j] = Math.min(list[j - 1], list[j]) + triangle.get(i).get(j);//中间
            }
            list[0] += triangle.get(i).get(0);//最左边的一行
        }
        int min = list[0];
        for(short k=1; k< triangle.size(); k++){
            min = Math.min(min, list[k]);
        }
        return min;
    }
}
