/*
Slot-1

Question 1

Design a way to sort the list of positive integers in descending order according to frequency of the elements.The elements with higher frequency come before those with lower frequency .Elements with the same frequency come in the same order as they appear in the given list.

input
-----
The first line of the input consists of an integer -num, representing the number of elements in the list(N).
The second line consists of N space separated integers representing the elements in the list.

output
------
Print N space-separated integers representing the elements of the list sorted according to the frequency of elements present in the given list


Example
-------

input:
19
1 2 2 3 3 3 4 4 5 5 5 5 6 6 6 7 8 9 10

output:
5 5 5 5 3 3 3 6 6 6 2 2 4 4 1 7 8 9 10

Explanation:
------------

The element 5 has highest frequency.
The elements 3 and 6 have same frequencies.So their original order has been maintained in the output.
The frequencies of rest of elements will be found and arranged in a similar way .
So the output will be : 5 5 5 5 3 3 3 6 6 6 2 2 4 4 1 7 8 9 10.

*/

import java.util.*;
public class opentextQ1{
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        int arr[]={1,2,2,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
        for(int i:arr){
            // hm.put(,i)
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        for(int j=arr.length-1;j>=0;j--){

        if(hm.containsValue(j)){
            for(int i:hm.keySet()){
                if(j==hm.get(i)){
                    for(int k=0;k<hm.get(i);k++){
                        System.out.print(i+" ");
                    }
                    // hm.remove(i);
                }
            }   
        }
    }
}
}