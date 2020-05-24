//LC 1051

class Solution {
    public int heightChecker(int[] heights) {
        int switches = 0;
        int[] newHeights = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            newHeights[i] = heights[i];
        }
        Arrays.sort(heights);
        
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != newHeights[i]){
                switches++;
            }
        }
        return switches;
    }
}
