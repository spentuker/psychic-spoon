class Solution {
    int maxCount=0;
    public int totalFruit(int[] fruits) {
        int b1,b2=0;
        b1=fruits[0];
        int b1i=0;
        int b2i=0;
        for(int i=1;i<fruits.length;i++){
            if(fruits[i] != b1){
                b2i=i;
                b2=fruits[i];
                break;
            }
        }
        int c=b2i-b1i+1;
        maxCount=c;
        // c++;
        // for(int i=b2i+1;i<fruits.length;i++){

        //     if(fruits[i]==b2){
        //         // b2i=i;
        //         c++;
        //         maxCount=Math.max(c,maxCount);
        //     }
        //     else if(fruits[i]==b1){
        //         // b1i=i;
        //         c++;
        //         maxCount=Math.max(c,maxCount);
        //     }
        //     else{
        //         maxCount=Math.max(c,maxCount);
        //         if(b1i>b2i){
        //             b2i=b1i;
        //             b1i=i;
        //             b2=b1;
        //             b1=fruits[i];
        //             c=b1i-b2i+1;
        //         }
        //         else{
        //             b1i=b2i;
        //             b2i=i;
        //             b1=b2;
        //             b2=fruits[i];
        //             c=b2i-b1i+1;
        //         }
        //     }
        // }
        int streak=1;
        for(int i=b2i+1;i<fruits.length;i++){
            
            if(b1==fruits[i]){
                c++;
                maxCount=Math.max(c,maxCount);
            } 
            else if(b2==fruits[i]){
                c++;
                maxCount=Math.max(c,maxCount);
            }
            else{
                b1=fruits[i-1];
                b2=fruits[i];
                c=streak+1;
                maxCount=Math.max(c,maxCount);
            }

            if(fruits[i]==fruits[i-1]) streak++;
            else streak=1;


        }
        return maxCount;
    }
}