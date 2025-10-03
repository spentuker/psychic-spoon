// Last updated: 10/3/2025, 2:11:48 PM
 class Solution{
     boolean wordCheck(String word, char x){
        for(char c:word.toCharArray()){
            if(c==x) return true;
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> li=new ArrayList<>();
        for (int i=0;i<words.length;i++){
            if(wordCheck(words[i],x)) li.add(i);
        }
        return li;
    }
}