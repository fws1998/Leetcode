import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution625 {
    public int maxIsland(int[][] grid){
        int ans = 0;

        for (int i=0; i!=grid.length; i++){
            for (int j=0; j!=grid[0].length; j++){
                int cur = 0;
                Queue<Integer> queuei = new LinkedList<Integer>();
                Queue<Integer> queuej = new LinkedList<Integer>();
                queuei.offer(i);
                queuej.offer(j);
                while (!queuei.isEmpty()){
                    int current_i = queuei.poll();
                    int current_j = queuej.poll();

                    if (current_i<0 || current_j<0 || current_i==grid.length || current_j==grid[0].length ||
                    grid[current_i][current_j]!=1){
                        continue;
                    }
                    cur++;
                    grid[current_i][current_j] = 0;
                    int[] di = {0,0,1,-1};
                    int[] dj = {1,-1,0,0};

                    for (int a=0; a<4; a++){
                        queuei.offer(current_i+di[a]);
                        queuej.offer(current_j+dj[a]);
                    }
                }
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }

    public int dfsStack(int[][] grid){
        int ans = 0;

        for (int i=0; i< grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                Deque<Integer> stacki = new LinkedList<Integer>();
                Deque<Integer> stackj = new LinkedList<Integer>();
                int cur = 0;
                stacki.push(i);
                stackj.push(j);

                while (!stacki.isEmpty()){
                    int current_i = stacki.pop();
                    int current_j = stackj.pop();

                    if (current_i<0 || current_j<0 || current_i== grid.length || current_j==grid[0].length
                    || grid[current_i][current_j]!=1){
                        continue;
                    }
                    cur++;

                    grid[current_i][current_j]=0;
                    int[] di = {0,0,1,-1};
                    int[] dj = {1,-1,0,1};

                    for (int a=0; a<4; a++){
                        stacki.push(current_i+di[a]);
                        stackj.push(current_j+dj[a]);
                    }
                }
                ans  =Math.max(cur, ans);
            }
        }

        return ans;
    }
}
