import java.util.*;
import java.util.stream.*;
public class streams4 {
    public static void main(String[] args) {
    List<Article> articles = List.of(
    new Article("Alice", "Java Streams 101", 600),
    new Article("Bob", "Advanced Java", 1200),
    new Article("Alice", "Collectors Deep Dive", 1500),
    new Article("Charlie", "Spring Boot Guide", 800),
    new Article("Bob", "Java Memory Model", 900),
    new Article("Charlie", "Reactive Programming", 300),
    new Article("Alice", "Intro to Maven", 400));
    
    Stream<Article> s= articles.stream();
    
    // Map<String,List<Article>> names=
    Map<String,Double> names=
// long c=
    s
        // .map(Article::getWordCount)
        // .filter(i->i.getWordCount()>=800)
        // .map(Article::getAuthor)
        // .forEach(System.out::println);
        // .map(Article::getWordCount)


        // .filter(i->i.getWordCount()>=1200)
        // .map(Article::getAuthor)
        // .forEach(System.out::println);


        // .collect(Collectors.groupingBy(Article::getAuthor));  //enable the map
        
        // .collect(Collectors.groupingBy(Article::getAuthor,Collectors.counting()));

        .collect(Collectors.groupingBy(Article::getAuthor,Collectors.averagingInt(Article::getWordCount)));
        
        // System.err.println(c);
        System.err.println(names); // for collection implementation.

        Optional <Map.Entry<String,Double>> Max=names.entrySet().stream()
                                                .max(Map.Entry.comparingByValue());

        Max.map(Map.Entry::getKey);
        System.err.println(Max);

    }
}
class Article {
    String author;
    String title;
    int wordCount;

    Article(String author,String title,int wordCount){
        this.author=author;
        this.title=title;
        this.wordCount=wordCount;

    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getWordCount() {
        return wordCount;
    }

    // constructor + getters
}
