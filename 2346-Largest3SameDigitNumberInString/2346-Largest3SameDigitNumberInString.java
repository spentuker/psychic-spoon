// Last updated: 10/3/2025, 2:12:01 PM
class Solution {
    public String largestGoodInteger(String num) {
      String maxString=" ";
      for(int i=0;i<num.length()-2;i++){
        if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1)== num.charAt(i+2)){
            String s=""+ num.charAt(i+1)+ num.charAt(i+1) +  num.charAt(i+1);
            if(maxString.charAt(0)<s.charAt(0)){
                maxString=s;
            }
        }
      }

      if(maxString==" ") return "";
      return maxString;
}
}