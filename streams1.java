import java.util.*;
import java.util.stream.Stream;
class streams1{
    public static void main(String[] args) {
        List<String> names=List.of("Shailesh","Pentuker","Shailu");
        Stream<String> name=names.stream();
         name
            .filter(i->i.startsWith("S")).peek(System.out::println)
            .map(String::toUpperCase).peek(System.out::println)
            .sorted()
            .forEach(System.out::println);
    }
}