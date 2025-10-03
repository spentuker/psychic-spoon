// Last updated: 10/3/2025, 2:14:03 PM
class trieNode{
    trieNode children[]=new trieNode[27];
    Boolean eow=false;
}
class WordDictionary {

    trieNode root;

    public WordDictionary() {

        root=new trieNode();

    }
    
    public void addWord(String word) {
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
    public boolean searchHelp(char[] word,int index,trieNode node){
        if(index==word.length) return node.eow;

            char ch=word[index];

            if(ch=='.'){
                for(int i=0;i<26;i++){
                    if(node.children[i] != null && searchHelp(word,index+1,node.children[i]))
                    return true;
                }
                return false;
            }
            else{
                int i=ch-'a';
                if(node.children[i]==null) return false; 
                return searchHelp(word,index+1,node.children[i]);
            }
        
    }
    public boolean search(String word) {
        // node=root;
        return searchHelp(word.toCharArray(),0,root);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */