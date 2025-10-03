// Last updated: 10/3/2025, 2:12:30 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] alpha=new int[26];

        for(char c:brokenLetters.toCharArray()){
            int i=c-'a';
            alpha[i]=1;
        }   

        String[] sen=text.split(" ");
        int res=sen.length;

        for(String s:sen){
            for(char c:s.toCharArray()){
                int i=c-'a';
                if(alpha[i]==1){
                    res--;
                    break;
                } 
            }
        }

        return res;

    }
}