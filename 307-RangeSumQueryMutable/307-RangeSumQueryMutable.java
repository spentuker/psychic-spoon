// Last updated: 10/3/2025, 2:13:33 PM
class NumArray {
    int[] tree;
    int n;
    public NumArray(int[] nums) {
        n=nums.length-1;
        tree=new int[nums.length*4];
        buildTree(nums,tree,0,nums.length-1,0);
    }
  

    void buildTree(int[] nums,int[] tree,int l,int r,int idx){
        if(l==r){
            tree[idx]=nums[l];
            return;
        }

        int mid=(l+r)/2;
        buildTree(nums,tree,l,mid,idx*2+1);
        buildTree(nums,tree,mid+1,r,idx*2+2);
        tree[idx]=tree[idx*2+1]+tree[idx*2+2];
    }
    
    public void update(int index, int val) {
        updateHelper(index,val,tree,0,n,0);

    }

    void updateHelper(int index,int val,int[] tree,int l,int r,int idx){
        
        if(l==r){
            tree[idx]=val;
            return;
        }

        int mid=(l+r)/2;

        if(index>mid){
            updateHelper(index,val,tree,mid+1,r,idx*2+2);  
        }
        else{
            updateHelper(index,val,tree,l,mid,idx*2+1);
        }
        
        tree[idx]=tree[idx*2+1]+tree[idx*2+2];
    }
    
    public int sumRange(int left, int right) {
        return sumRangeHelper(left,right,0,n,0);
    }
    int sumRangeHelper(int left,int right,int l,int r,int idx)
    {
        if(right<l || left >r) return 0;
        if(right>=r && left<=l) return tree[idx];

        int mid=(l+r)/2;

        return sumRangeHelper(left,right,l,mid,idx*2+1)+sumRangeHelper(left,right,mid+1,r,idx*2+2);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */