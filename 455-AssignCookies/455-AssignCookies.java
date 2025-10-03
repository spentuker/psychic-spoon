// Last updated: 10/3/2025, 2:13:13 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n1=g.length;
        int n2=s.length;
        
        int i=0;
        int j=0;
        int c=0;
        while(i<n1 && j<n2){

            if(s[j]>=g[i]){
                c++;
                i++;j++;
            }
            else{   
                j++;
                // break;
            }
        }

        return c;
    }
}