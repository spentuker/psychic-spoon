// Last updated: 10/3/2025, 2:11:38 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int[] tree=new int[baskets.length*4];

        buildTree(tree,baskets,0,0,baskets.length-1);
        return solveTree(tree,fruits,baskets);
    }
    void buildTree(int[] tree,int[] baskets,int idx,int l,int r){
        if(l==r){
            tree[idx]=baskets[l];
            return;
        }

        int mid=(l+r)/2;
        buildTree(tree,baskets,2*idx+1,l,mid);
        buildTree(tree,baskets,2*idx+2,mid+1,r);
        tree[idx]=Math.max(tree[2*idx+1],tree[2*idx+2]);

    }

    int solveTree(int[] tree,int[] fruits,int[] baskets){
        int unplaced=fruits.length;
        for(int i:fruits){
            if(solveHelper(i,tree,0,0,baskets.length-1)){
                unplaced--;
            }
        }
        return unplaced;
    }

    boolean solveHelper(int i,int[] tree,int idx,int l,int r){
        if(tree[idx]<i) return false;
        if(l==r){
            if(tree[idx]>=i){
                tree[idx]=-1;
                return true;
            }
            return false;
        }
        int mid=(l+r)/2;
        
        if(solveHelper(i,tree,idx*2+1,l,mid)){
            tree[idx]=Math.max(tree[idx*2+1],tree[idx*2+2]);
            return true;
        }
        else{
            if(solveHelper(i,tree,idx*2+2,mid+1,r)){
                tree[idx]=Math.max(tree[idx*2+1],tree[idx*2+2]);
                return true;
            }
        }
        return false;


    }
}