import java.util.ArrayList;
import java.util.List;

public class Solution802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Short length = (short) graph.length;
        byte[] colour = new byte[length];
        List<Integer> result = new ArrayList<>();
        for (short i=0; i<length; ++i){
            if(safe(graph, colour, i)){
                result.add((int) i);
            }
        }
        return result;
    }

    private boolean safe(int[][] graph, byte[] colour, int i){
        if(colour[i]>0){
            return colour[i]==2;
        }else{
            colour[i] = 1;
        }
        for (int a : graph[i]){
            if(!(safe(graph, colour, a))){
                return false;
            }
        }
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
