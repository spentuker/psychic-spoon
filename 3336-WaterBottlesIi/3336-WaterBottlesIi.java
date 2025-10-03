// Last updated: 10/3/2025, 2:11:43 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res=numBottles;
        int empty=numBottles;


        while(empty>=numExchange){
            // res+=empty;
            empty=empty-numExchange;
            if(empty>=0){
                res+=1;
                empty+=1;
                numExchange+=1;
            }
        }
        return res;
    }
}