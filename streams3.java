import java.util.*;
import java.util.stream.*;
public class streams3 {
    public static void main(String[] args) {
        //remove duplicates 
        List<Integer> l=List.of(1,2,3,3,3,45,7);
        Stream s=l.stream();
        long c=s   
            .distinct()
            .count();
        System.err.println(c);
    }
}
