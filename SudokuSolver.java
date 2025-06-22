public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        // Your backtracking logic here
        solve(board);
    }
    boolean solve(char[][] board){
            for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        board[i][j]=k;
                        if(isValid(board,i,j,k)){
                            if(solve(board)==true)
                           return true;
                            // else return false;
                        }
                        // else{
                            board[i][j]='.';
                        // }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isValid(char[][] board,int i,int j,char k){
        //1st row
        int c=0; 
        for(int m=0;m<board.length;m++){
            if(board[i][m]==k){
                c++;
            }
            if(c>1) return false;
        }
        c=0;
        //1st column 
        for(int m=0;m<board[0].length;m++){
            if(board[m][j]==k){
                c++;
            }
            if(c>1) return false;
        }
        c=0;
        int m=3*(i/3);
        int n=3*(j/3);

        for (int p=m;p<m+3;p++){
            for (int q=n;q<n+3;q++){
                if(board[p][q]==k) c++;
                if(c>1) return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        // Printing the board after solving
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
