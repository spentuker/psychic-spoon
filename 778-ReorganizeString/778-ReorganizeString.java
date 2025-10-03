// Last updated: 10/3/2025, 2:12:54 PM
class Solution {
    public String reorganizeString(String s) {
        int[] chars=new int[26];
        int high_freq=0;
        char high_freq_c=' ';

        for(char c:s.toCharArray()){
            chars[c-'a']++;
            if(chars[c-'a']>(s.length()+1)/2) return "";
            if(chars[c-'a']>high_freq){
                high_freq=chars[c-'a'];
                high_freq_c=c;
            }
        }
        // System.out.println(Arrays.toString(chars));

        char[] res=new char[s.length()];
        Arrays.fill(res,' ');
        int j=0;

        for(int i=0;high_freq>0;i+=2){          
            res[i]=high_freq_c;
            high_freq--;
            j=i;
        }
        // j--;

        // System.out.println(Arrays.toString(res));
        for(char i='a';i<='z';i++){
            if(i==high_freq_c) continue;
            if(chars[i-'a']==0) continue;
            while(chars[i-'a']!=0){
                // System.out.println("For char"+i);
                // System.out.println(j);
                chars[i-'a']--;
                if(j>=res.length-1) j=1;
                // System.out.println(j);
                // if(res[j]>='a' && res[j]<='z'){
                //     while(res[j]>='a' && res[j]<='z' && j<res.length-1){
                //         j++;
                //     }
                // }
                // while(!(res[j]==' ') && j<res.length-1)
                //         j+=1;
                // System.out.println("After while loop:"+j);
                // if(res[j]==' ')
                //         res[j]=i;
                while(j<s.length() && res[j]!=' '){
                    j+=2;
                }
                if(j>=s.length())
                    j=1;
                if(res[j]==' ')
                    res[j]=i; 
                // j+=2;
            }
            System.out.println(Arrays.toString(res));
        }

        return new String(res);
        


    }
}