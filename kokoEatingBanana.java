class kokoEatingBanana {
    int h;
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=Integer.MIN_VALUE;
        this.h=h;
        for(int a:piles){
            // min=Math.min(a,min);
            max=Math.max(a,max);
        }
        
        return bs(min,max,piles,h);
    }

    int bs(int min,int max,int[] piles,int h){
        int min_res=Integer.MAX_VALUE;
        while(min<=max){
            int mid=(min+max)/2;
            long hours=check(mid,piles);
            if(hours<=h){
                min_res=Math.min(min_res,mid);
                max=mid-1;
            }
            else{
                min=mid+1;
            }
            // else{
            //     max=mid-1;
            // }
        }

        return min_res;
    }

    long check(int hours,int[] piles){
        long res=0;
        for(int a:piles){
            // while(a>0){
            //     a-=hours;
            //     res+=1;
            // }
            // if(res+hours+a>=Integer.MAX_VALUE){
            //     while(a>0){
            //         a-=hours;
            //         res+=1;
            //     }
            //     continue;
            // }
            res+=(a+hours-1)/hours;
            if(res>h) return res;               
        }
        return res;
    }

}