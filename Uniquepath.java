import java.util.*;

public class Uniquepath{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
    Solution sol=new Solution();
    sol.getSol(a,m,n);
    }
}

class Solution{
    
    void getSol(int[][] a,int m,int n){
        
        int a1[][]=new int[m][n];
        
        if(a[0][0]==1){System.out.println(0);return;}
        if(a[m-1][n-1]==1){System.out.println(0); return;}

        a1[0][0]=1;
        // 1st row
        for(int i=1;i<n;i++){
            if(a[0][i]==0 && a1[0][i-1]==1){
                a1[0][i]=1;
            }
            else{
                a1[0][i]=0;
            }
        }
        
        //1st col
        for(int i=1;i<m;i++){
            if(a[i][0]==0 && a1[i-1][0]==1) {a1[i][0]=1;}
            else{
                a1[i][0]=0;
            }
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]==1){
                    a1[i][j]=0;
                }
                else{
                    a1[i][j]=1;
                }
            }
        }
        // System.out.println(Arrays.deepToString(a1));


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a1[i][j]==0) continue;
                a1[i][j]=a1[i-1][j]+a1[i][j-1];
            }
        }

        // System.out.println(Arrays.deepToString(a1));
        
        System.out.println(a1[m-1][n-1]);
                
        //     for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(a1[i][j]+" ");
        //     }
        //     System.out.println();
        // }  
        
        // System.out.println(Arrays.deepToString(a1));
        
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         if(a1[i][j]==0) continue;
        //         if(i!=0 && j!=0){
                    
        //             a1[i][j]=a1[i-1][j]+a1[i][j-1];
        //         }
        //     }
        // }
        // System.out.println(a1[m-1][n-1]);
        

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(a1[i][j]+" ");
        //     }
        //     System.out.println();
        // }    
        }
 
    
}