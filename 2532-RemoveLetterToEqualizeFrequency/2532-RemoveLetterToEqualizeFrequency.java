// Last updated: 10/3/2025, 2:11:53 PM
class Solution {
    public boolean equalFrequency(String word) {
     HashMap<Character,Integer> hm=new HashMap<>();
     for(char c:word.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
     }
     HashMap<Integer,Integer> freq=new HashMap<>();
    //  System.out.println(hm);
     for(int i:hm.values()){
        freq.put(i,freq.getOrDefault(i,0)+1);
     }
    //  System.out.println(freq);
     if(freq.size()>2){ System.out.println("size triggered"); return false;}
     if(freq.size()==1) {
        int key=freq.keySet().iterator().next();
        if(key==1 || freq.get(key)==1){
        return true;}
        return false;
        }

     int k1=freq.keySet().iterator().next();
     int c1=freq.get(k1);
     freq.remove(k1);
     int k2=freq.keySet().iterator().next();
     int c2=freq.get(k2);

    //  System.out.println("k1 "+k1+"c1 "+c1+"k2 "+k2 + "c2 "+c2);

     
     if(k1==1 && c1 == 1) return true;  //for test cases such as aabbccx. Here the 1 is the 'x'. If a letter repeats itself once and only exists once, it can be removed. A testcase that would fail is aabbxy. Here the freq hashmap is 1:2. There are 2 letters which repeats itself only once. But you can only remove one letter noh. So it will fail. So the key has to be one as well as the value shall be one. That means that there is a letter (eg 'a') which repeats one time. It can be removed.
     // aab
     if(Math.abs(k1-k2)==1 && c2==1) return true; // the reason for which c2==1 is because its the number of times f2 has appeared. For example, aaabbcc-> a:3,b:2,c:2->3:1,2:4->f2=3 (hashmaps are sorted)-> one 'a' can be removed. But now if suppose aaabbbcc Exists. Then the hashmap would be somehting like 3:2,2:1. Then, itd be a false case. 
     // aabb has been handled before as its freq.size()=1;


     //  for(int k:freq.keySet()){
    //     diff=freq.get(k)-diff;
    //  }
    //  System.out.println("Diff is "+diff);
    //  if(diff == 1 || diff == -1 || diff==0 || diff==-2 || diff==2) return true;
     return false;
    //  int i=1;
    //  Set<Integer> hs=new HashSet<>();
    }
}