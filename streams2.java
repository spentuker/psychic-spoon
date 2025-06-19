import java.util.*;
import java.util.stream.*;
import java.util.stream.Stream.*;
public class streams2 {
    public static void main(String[] args) {
        Stream<Integer> i=Stream.of(1,2,3,4,5,6);
    List<Integer> hello=
        Stream.iterate(1,n->n+1*n+1).limit(10)
        // .forEach(System.out::println)
        .collect(Collectors.toList());

        System.out.println(hello);
        

        // Stream<Integer> h= Stream.of(hello);

    }
}
