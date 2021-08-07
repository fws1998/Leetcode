import java.util.ArrayList;
import java.util.List;
/*
从0开始dfs递归每个点，
没有遍历过的点为0
遍历过的为1
安全的为2
 */
public class Solution802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Short length = (short) graph.length;
        byte[] colour = new byte[length];//各点标记
        List<Integer> result = new ArrayList<>();//安全的列表
        for (short i=0; i<length; ++i){
            if(safe(graph, colour, i)){
                result.add((int) i);
            }
        }
        return result;
    }

    private boolean safe(int[][] graph, byte[] colour, int i){
        if(colour[i]>0){//是1则不安全 2则安全
            return colour[i]==2;
        }else{
            colour[i] = 1;
        }
        for (int a : graph[i]){//colour【i】未遍历， DFS
            if(!(safe(graph, colour, a))){//不安全
                return false;
            }
        }
        //返回的都是false 说明是安全的
        colour[i]=2;
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {1,2},{2,3},{5},{0},{5},{},{}
        };
        new Solution802().eventualSafeNodes(graph);
    }
}
