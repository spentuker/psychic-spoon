// Last updated: 10/3/2025, 2:12:21 PM
class Solution {
    public int maximum69Number (int num) {
        //ArrayList<Integer> al = new ArrayList<>();
        int temp=num;
        int l=0;
        while(temp>0){
            l++;
            temp/=10;
        }
        l-=1;
        int n=(int)Math.pow(10,l);
        temp=num;
        while(l>=0){
                    System.out.println(n);
        System.out.println(temp);

            if((temp/n)==6){
                num=num+(3*n);
                return num;
            }
            temp%=n;
            n/=10;
            
            l--;
        }
       return num;
        // 6999-
        // 999
        // 99
        // 9
        // 9999/100;
    }
}