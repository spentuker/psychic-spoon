// Last updated: 10/3/2025, 2:14:40 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // int i=1;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r=new ArrayList<>();
            List<Integer> p=new ArrayList<>();
            if(i>=1) p=res.get(i-1);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    r.add(1);
                }
                else{
                    int e=p.get(j-1)+p.get(j);
                    r.add(e);
                }
            }
            res.add(r);
        }
        return res;
    }
}