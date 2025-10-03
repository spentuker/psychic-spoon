// Last updated: 10/3/2025, 2:11:40 PM
class Solution {
    public static int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int l=nums.length;
        if(k==l){
            int max=Integer.MIN_VALUE;
            for(int t:nums){
                max=Math.max(max,t);
            }
            return max;
        }
        for(int t:nums){
            if(hm.containsKey(t)){
            continue;}
            for(int i=0;i<l;i++){
                System.out.println("value "+i+k);
                if(i+k<=l){
                System.out.println("in");
                for(int j=0;j<k;j++){
                        if(nums[i+j]==t){
                            System.out.println("Detected a match"+t);
                            if(hm.containsKey(t)){
                                int val=hm.get(t)+1;
                                hm.put(t,val);
                                System.out.println(t+" "+val);
                            }
                            else{
                                hm.put(t,1);
                                System.out.println(t+" "+1);
                            }
                        }
                    }
                }
                else
                break;
            }
        }
        System.out.println(hm);
        int m=Integer.MIN_VALUE;
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
            m=Math.max(i,m);
            }
        }
        if(m==Integer.MIN_VALUE){
            return -1;
        }
        return m;

}
}
    