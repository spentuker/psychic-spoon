import java.util.*;
public class nonDupLetter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
        for(char ch:c){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
