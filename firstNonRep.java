import java.util.*;
public class firstNonRep {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int[] arr=new int[n];
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            // arr[i]=sc.nextInt();
            int inp=sc.nextInt();
            hm.put(inp,hm.getOrDefault(inp,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());break;
            }
        }

        // LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>
    }
}
