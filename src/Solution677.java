import java.util.HashMap;

public class Solution677 {

    class MapSum {

        HashMap<String, Integer> map;
        HashMap<String, Integer> prefixMap;


        public MapSum() {
            map = new HashMap<>();
            prefixMap = new HashMap<>();

        }

        public void insert(String key, int val) {
            int delta = val-map.getOrDefault(key, 0);
            map.put(key, val);
            for (int i=0; i<key.length(); i++){
                String current = key.substring(0, i+1);
                prefixMap.put(current, prefixMap.getOrDefault(current, 0)+delta);
            }
        }

        public int sum(String prefix) {
            return prefixMap.getOrDefault(prefix, 0);
        }
    }

}
