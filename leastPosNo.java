import java.util.Arrays;
import java.util.HashMap;

public class leastPosNo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        hm.put(3,0);
        hm.put(1,22);
        System.err.println(hm);
        for(int a: hm.keySet()){
            System.out.println(a);
        }
    }
}
