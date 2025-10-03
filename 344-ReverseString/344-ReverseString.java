// Last updated: 10/3/2025, 2:13:31 PM
class Solution {
    public void reverseString(char[] c) {
        int p1=0;
        int p2=c.length-1;

        while(p1<p2){
            char temp=c[p1];
            c[p1]=c[p2];
            c[p2]=temp;
            p1++;p2--;
        }
    }
}