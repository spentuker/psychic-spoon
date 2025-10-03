// Last updated: 10/3/2025, 2:13:09 PM
class Solution {
    int[][] memo;
    int c=0;
    public int change(int amount, int[] coins) {
        memo=new int[coins.length][amount+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        int res=dfsish(coins,0,amount);
        return res;
    }

    int dfsish(int[] coins,int idx,int tar){
        if(memo[idx][tar]!=-1){
            return memo[idx][tar];
        }
        if(tar<0){
            return 0;
        }
        if(tar==0){
            // System.out.println("Count is "+ (c+1));         
            return 1;
        }
        if(idx==coins.length-1){
            if(tar%coins[idx]==0)
                return 1;
            return 0;
        }


        int take=0;
        if(coins[idx]<=tar){
            take=dfsish(coins,idx,tar-coins[idx]);
        }
        int not_take=dfsish(coins,idx+1,tar);
        
        return memo[idx][tar]=take+not_take;
    }
    
}