//LC 1441
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> retArray = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int range = n;
        
        for(int i = range; i > 0 ; i--){
            stack.push(range);
            range--;
        }
        
        for(int j : target){
            while(!stack.isEmpty()){
                if(j == stack.pop()){
                    retArray.add("Push");
                    break;
                }else{
                    retArray.add("Push");
                    retArray.add("Pop");
                }
            }
        }    
        
        return retArray;
    }
}
