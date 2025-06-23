import java.util.ArrayList;

public class wordSearch2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };

        String[] words = {"oath","pea","eat","rain"};
        List<String> result = sol.findWords(board, words);
        System.out.println(result);
    }
}

class Solution{
    List<String> findWords (char[][] board, String[] words){
        Node root=new Node();
        for(String word:words){
        root.insert(word);
        }
        List<String> hello=wordSearch(board,words,root);
    }

    List<String> wordSearch(char[][] board,String[][] words,Node root){
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;i<board[0].length;j++){
                // char a=board[i][j];
                    dfs(board,i,j,root,res);
            }
        }
    }
    boolean dfs(char[][] board,int i,int j,Node root,List<String> res){
        if(root.eow==true) return true;
        if(i<0 || i>= board.length || j<0 || j>=board[0].length) return false;
        if(root.children[board[i][j]-'a']==null) return false;
        else root=root.children[board[i][j]-'a'];

        board[i][j]='.';
        l_n=dfs(board,i,j-1,root,res);
        r_n=dfs(board,i,j+1,root,res);
        t_n=dfs(board,i-1,j,root);
        b_n=dfs(board,i+1,j,root);



    }
    

}

class Node{
    Node[] children=new children[26];
    boolean eow=false;

    Node trie=new Node();

    void insert(String word){
        Node root=trie;
        for(char c:word.toCharArray()){
            int a=c-'a';
            if(root.children[a]==null){
                root.children[a]=new Node();
            }
            root=root.children;
        }
        root.eow=false;
    }


}