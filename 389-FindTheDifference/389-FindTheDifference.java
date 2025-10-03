// Last updated: 10/3/2025, 2:13:19 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int s_c=0;
        for(char c: s.toCharArray()){
            s_c+=c;
        }
        int s_c1=0;
        for(char c:t.toCharArray()){
            s_c1+=c;
        }
        int missing=Math.abs(s_c-s_c1);
        char m=(char)missing;
        return m;
    }
}