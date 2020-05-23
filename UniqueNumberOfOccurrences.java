//LC 1207
class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        
        //record the number of occurances for each number into a hashmap
        for(int i = 0; i < arr.length; i++){
            int place = arr[i];
            
            if(!(m1.containsKey(place))){
                m1.put(place, 1);
            }else{
                int place2 = m1.get(place);
                place2 += 1;
                m1.put(place, place2);    
            }
        }
        
        //put the values of the map into a list
        List<Integer> values = new ArrayList<Integer>(m1.values());
        
        //compare each element in list, checks if the any of the number of occurences are equal 
        for (int i = 0; i < values.size(); i++) {
          for (int j = i+1; j < values.size(); j++) {
            if(values.get(i) == values.get(j)) {
              return false;
            }
          }
        }
        return true;
    }
}
