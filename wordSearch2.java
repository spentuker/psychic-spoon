import java.util.*;

public class wordSearch2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // char[][] board = {
        //     {'o','a','a','n'},
        //     {'e','t','a','e'},
        //     {'i','h','k','r'},
        //     {'i','f','l','v'}
        // };

        char[][] board = {
            {'a','b'},
            {'c','d'}
        };

        // String[] words = {"oath","pea","eat","rain"};
        String[] words = {"abcb"};
        List<String> result = sol.findWords(board, words);
        System.out.println(result);
    }
}

class Solution{
    List<String> findWords(char[][] board,String[] words){
        // List<String> res=new ArrayList<>();
        Node trie= insertWords(new Node(),words);
        Set<String> result = new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(trie,i,j,new String(),result,board);
            }
        }
        
        
        for(String a: result){
            System.err.println(a);
        }

        return new ArrayList<>(result); //wrong returrn, will come back to it later. maybe fixed now idk. 
    }

    Node insertWords(Node root,String[] words){
        for(String s:words){
            root.insert(s);
        }
        return root;
    }

    void dfs(Node trie,int i,int j, String s,Set<String> result,char[][] board){

        if(i<0 || i >= board.length || j<0 || j >= board[0].length || board[i][j] == '.') return;

        

        if(trie.eow==true){
            result.add(s); 
            return;
        }
        s+=board[i][j];
        int a=board[i][j] - 'a';
        if(trie.children[a] != null){
            trie=trie.children[a];
            char temp=board[i][j];

            board[i][j]='.';

            dfs(trie, i, j-1, s, result, board);
            dfs(trie, i, j+1, s, result, board);
            dfs(trie, i-1, j, s, result, board);
            dfs(trie, i+1, j, s, result, board);

            board[i][j]=temp;
        }
        return;
    }
}

class Node{
    Node[] children;
    boolean eow;

    Node(){
        this.children=new Node[26];
        this.eow=false;
    }

    // Node root=new Node();

    void insert(String word){
       Node root=this;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(root.children[i]==null){
                root.children[i]=new Node();
            }
            root=root.children[i];
        }
        root.eow=true;
    }
}