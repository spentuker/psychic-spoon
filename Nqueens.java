import java.util.*;


public class Nqueens {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // You can change this value for different board sizes
        List<List<String>> results = solution.solveNQueens(n);

        // for (List<String> board : results) {
        //     for (String row : board) {
        //         System.out.println(row);
        //     }
        //     System.out.println(); // Separate different solutions
        // }
        System.out.println(results);
    }
}

class Solution{
    List<List<String>> solveNQueens(int n){
        List<List<String>> al=new ArrayList<>();

        char[][] board= new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }

        solver(al,board,0,0);

        return al;

    }

    void solver(List<List<String>> al,char[][] board,int row,int q_c){
        System.err.println(q_c);
        if(q_c==board[0].length){
            // to write. 
            System.err.println("Triggered");
            List<String> oneRow=new ArrayList<>();

            for(int i=0;i<board[0].length;i++){
                String s=new String();
                for(char c:board[i]){
                    s+=c;
                }
                oneRow.add(s);
            }
            al.add(oneRow);
            return; 
        }
        
        for(int j=0;j<board[0].length;j++){

            if(isValid(board,row,j)){

                board[row][j]='Q';
                solver(al, board, row+1, q_c+1);
                board[row][j]='.';

            }

            // return;

        }
        

        
    }

    boolean isValid(char[][] board,int row,int j){

          for(int col=0;col<board[0].length;col++){
            if(board[row][col]=='Q') return false;
          } 
          
         for(int r=0;r<board.length;r++){
            if(board[r][j]=='Q') return false;
         }
         
         // diagnoal, top left. 

         for(int r=row-1, c=j-1;r>=0 && c>=0;r--,c--){
            if(board[r][c]=='Q') return false;
         }

         // diagnoal, top right. 

         for(int r=row-1,c=j+1 ; r>=0 && c<board.length;r--,c++){
            if(board[r][c]== 'Q') return false;
         }

         return true;
         
         } 

}