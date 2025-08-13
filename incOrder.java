import java.util.*;
public class incOrder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n==1) {System.out.println(true);return;}
        System.out.println(checker(n));

        
    }
    static boolean checker(int n){
        Scanner sc=new Scanner(System.in);
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==0) continue;
            if(arr[i]<=arr[i-1]) return false;
       }
       return true;
    }
}
