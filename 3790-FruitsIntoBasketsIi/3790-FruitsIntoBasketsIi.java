// Last updated: 10/3/2025, 2:11:36 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        // int unplaced=0;
        int placed=0;
        
        int n1=fruits.length;
        
        int p1=0;
        int p2=0;
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                if(fruits[i]<=baskets[j]){
                    //System.out.println("This fruit"+fruits[i] + "will fit in "+baskets[j]);
                    baskets[j]=-1;
                    placed++;break;
                }
            }
        }

        for(int a:baskets){
            System.out.print(a + " ");
        }
        return n1-placed;
    }

}