import java.util.*;
class reverseString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(reverse(s));
    }
    static String reverse(String s){
        int i=0;
        int j=s.length()-1;
        char[] ss=s.toCharArray();
        while(i<j){
            char t=ss[i];
            ss[i]=ss[j];
            ss[j]=t;
            i++;j--;
        }
        return new String(ss);
    }
}