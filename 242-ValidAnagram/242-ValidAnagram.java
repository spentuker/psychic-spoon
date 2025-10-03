// Last updated: 10/3/2025, 2:13:44 PM
class Solution {
    public boolean isAnagram(String s, String t) {
     int[] a=new int[26];
     if(s.length()!=t.length()) return false;
     for(int i=0;i<s.length();i++){
        
        a[s.charAt(i)-'a']++;
       
        a[t.charAt(i)-'a']--;
     }
     for(int j:a){
        if(j!=0) return false;
     }
     return true;
    }
}