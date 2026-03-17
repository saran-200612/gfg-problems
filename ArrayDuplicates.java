import java.util.*;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        
        for(int key : map.keySet()){
            if(map.get(key) > 1){
                result.add(key);
            }
        }
        
        Collections.sort(result); 
        return result;
    }
}
