// LC 657
class Solution {
    public boolean judgeCircle(String moves) {
        int[] position = new int[]{0,0};
        
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                position[1]++;
            }
            if(moves.charAt(i) == 'D'){
                position[1]--;
            }
            if(moves.charAt(i) == 'R'){
                position[0]++;
            }
            if(moves.charAt(i) == 'L'){
                position[0]--;
            }
        }
        
        return (position[0] == 0 && position[1] == 0);
    }
}
