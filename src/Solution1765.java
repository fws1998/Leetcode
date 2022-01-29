import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution1765 {
    public int[][] highestPeak(int[][] isWater) {
        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int[][] res = new int[isWater.length][isWater[0].length];
        for(int i=0; i< res.length; i++){
            Arrays.fill(res[i], -1);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i=0; i< res.length; i++){
            for(int j=0; j<res[0].length; j++){
                if (isWater[i][j] == 1){
                    res[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()){
            int[] a = queue.poll();
            for (int[] coor: dir){
                int x = a[0] + coor[0], y = a[1] + coor[1];
                if (0 <= x && x < res.length && 0 <= y && y < res[0].length && res[x][y] == -1) {
                    res[x][y] = res[a[0]][a[1]] + 1;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return res;
    }
}
