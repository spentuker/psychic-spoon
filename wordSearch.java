import java.util.*;


public class wordSearch {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        char[][] board1 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word1 = "ABCCED";
        System.out.println("Test 1: " + solution.exist(board1, word1)); // true

        // Test case 2
        char[][] board2 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word2 = "SEE";
        System.out.println("Test 2: " + solution.exist(board2, word2)); // true

        // Test case 3
        char[][] board3 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word3 = "ABCB";
        System.out.println("Test 3: " + solution.exist(board3, word3)); // false

        // Edge case: single letter board
        char[][] board4 = {
            {'A'}
        };
        String word4 = "A";
        System.out.println("Test 4: " + solution.exist(board4, word4)); // true

        // Edge case: word longer than board cells
        char[][] board5 = {
            {'A','B'},
            {'C','D'}
        };
        String word5 = "ABCDE";
        System.out.println("Test 5: " + solution.exist(board5, word5)); // false
    }
}

class Solution{
    boolean exist(char[][] board,String word){
        // boolean[][] visited=new boolean[board.length][board[0].length];


        return existHelper(board,word);

    }

    boolean existHelper(char[][] board,String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0)) return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board,String word,int i,int j,int idx){

        
        if(idx==word.length()) return true;
        if(j<0 || i<0 || j>=board[0].length || i>=board.length) return false;

        if(board[i][j]==word.charAt(idx)){
        char temp=board[i][j];
        board[i][j]='.';
        boolean l_n=dfs(board, word, i, j-1, idx+1);
        boolean r_n=dfs(board, word, i, j+1, idx+1);

        boolean t_n=dfs(board, word, i-1, j, idx+1);
        boolean b_n=dfs(board, word, i+1, j, idx+1);
        board[i][j]=temp; //in this way, suppose a test case exists, AA and then below the first A, there is B. The target word is AAB. Now, this will output "true" in path of A(2nd A)->A->B
        return l_n || r_n || t_n || b_n;
        }
        return false;

    }
}