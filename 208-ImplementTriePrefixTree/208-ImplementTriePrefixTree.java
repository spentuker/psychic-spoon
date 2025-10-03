// Last updated: 10/3/2025, 2:14:06 PM
class trieNode{
    trieNode[] children=new trieNode[26];
    Boolean eow=false;
}
class Trie {
    trieNode root;
    public Trie() {
        root=new trieNode();
    }
    
    public void insert(String word) {
        trieNode node=root;

        for(char ch:word.toCharArray()){
            int i=ch-'a';
            if(node.children[i]==null){
                node.children[i]=new trieNode();
            }
            node=node.children[i];
        }
        node.eow=true;
        
    }
    
    public boolean search(String word) {
        trieNode node=root;
        for(char ch:word.toCharArray()){
            int i=ch-'a';
            if(node.children[i]==null) return false;
            node=node.children[i];
        }
        if(node.eow==true){
            return true;
        }
        return false;
        
    }
    
    public boolean startsWith(String prefix) {
        trieNode node=root;
                for(char ch:prefix.toCharArray()){
                    int i=ch-'a';
                    if(node.children[i]==null) return false;
                    node=node.children[i];
                    }
                                                            
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */