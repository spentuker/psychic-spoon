// Last updated: 10/3/2025, 2:12:51 PM
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count=new int[121];

        for(int i=0;i<ages.length;i++){
            count[ages[i]]+=1;
        }
        // System.out.println(Arrays.toString(count));
        int req=0;
        for(int x=0;x<121;x++){
            if(count[x]==0) continue;
            for(int y=0;y<121;y++){
              if(count[y]==0) continue;

              if(y>x) continue;
              if(y<=0.5*x+7) continue;
              
              req+=count[x]*count[y];

              if(x==y){
                req-=count[x];
              }

            }
        }

        return req;
    }
}