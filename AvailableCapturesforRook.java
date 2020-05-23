class Solution {
    public int numRookCaptures(char[][] board) {
    
    int moveCount = 0; 
    
    /* the idea is to iterate through each square until we find the rook,
    once we find the rook (and knowing each row and column is limited to 8 squares),
    we check all elements to the right and left of the rook (West, East) by manipulating j and
    holding i, and also above and below (North, South) by manipulating i and
    holding j. Each while loop will check conditions until every cardinal direction 
    has been checked. Then the number of available moves is returned.*/
    
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[0].length; j++){
            
        if(board[i][j] == 'R'){
            int n = i;
            while(n >= 0){
                if(board[n][j] == 'p'){
                    moveCount++;
                    break;
                }
                if(board[n][j] == 'B'){
                    break;
                }
                n--;  
            }
            
            int s = i;
            while(s < 8){
                if(board[s][j] == 'p'){
                    moveCount++;
                    break;
                }
                if(board[s][j] == 'B'){
                    break;
                }
                s++;
            }
            
            int e = j;
            while(e < 8){
                if(board[i][e] == 'p'){
                    moveCount++;
                    break;
                }
                if(board[i][e] == 'B'){
                    break;
                }
                e++;
            }
            
            int w = j;
            while(w >= 0){
                if(board[i][w] == 'p'){
                    moveCount++;
                    break;
                }
                if(board[i][w] == 'B'){
                    break;
                }
                w--;
            }
            break;
        }         
        }
    }
        
    return moveCount;
}
}
