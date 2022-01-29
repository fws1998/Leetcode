import java.util.HashMap;

public class Solution997 {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> from = new HashMap<>();
        HashMap<Integer, Integer> to = new HashMap<>();

        for (int[] i : trust){
            if (from.containsKey(i[0])){
                from.put(i[0], from.get(i[0])+1);
            }else {
                from.put(i[0], 1);
            }

            if (to.containsKey(i[1])){
                to.put(i[1], to.get(i[1])+1);
            }else {
                to.put(i[1], 1);
            }
        }

        for (int a=1; a<=n; a++){
            if (!from.containsKey(a) && to.getOrDefault(a, 0)==n-1){
                return a;
            }
        }
        return -1;
    }
}
