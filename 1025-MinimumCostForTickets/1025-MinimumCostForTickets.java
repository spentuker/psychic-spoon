// Last updated: 10/3/2025, 2:12:37 PM
class Solution {
    int[] memo;
    public int mincostTickets(int[] days, int[] costs) {
        memo=new int[days.length];
        Arrays.fill(memo,-1);
        int res=dfs(days,costs,0);
        return res;
    }

    int dfs(int[] days,int[] costs,int idx){

        if(idx>=days.length){
            return 0;
        }

        if(memo[idx]!=-1)
            return memo[idx];
    
        int cost_1=costs[0]+dfs(days,costs,idx+1);
        
        int max_days=days[idx]+7-1;
        int j=idx;

        while(j<days.length && days[j]<=max_days){
            j+=1;
        }

        int cost_2=costs[1]+dfs(days,costs,j);

        max_days=days[idx]+30-1;
        j=idx;

        while(j<days.length && days[j]<=max_days){
            j+=1;
        }

        int cost_3=costs[2]+dfs(days,costs,j);

        return memo[idx]=Math.min(cost_1,Math.min(cost_2,cost_3));
    }
}