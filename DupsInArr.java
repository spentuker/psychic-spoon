import java.util.*;
public class DupsInArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();

            hm.put(a,hm.getOrDefault(a,0)+1);

        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");
            }
        }
    }
}
