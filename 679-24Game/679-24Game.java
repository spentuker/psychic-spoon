// Last updated: 10/3/2025, 2:12:58 PM
class Solution {
    public boolean judgePoint24(int[] cards) {
        ArrayList<Double> card=new ArrayList<>();
        for(double i:cards){
            card.add(i);
        }

        return bt(card);
    }

    boolean bt(ArrayList<Double> cards){
        // System.out.println(cards);
        if(cards.size()==1){
            if(Math.abs(cards.get(0)-24)<1e-6) return true;
            return false;
        }

        for(int i=0;i<cards.size();i++){
            for(int j=0;j<cards.size();j++){
                if(i==j) continue;
                double one=cards.get(i);double two=cards.get(j);
                // System.out.println("choen"+one+" "+two);
                ArrayList<Double> res=new ArrayList<>();
                
                res.add(one+two);
                res.add(one-two);res.add(two-one);
                res.add(one*two);
                if(one != 0 || two!=0){res.add(one/two);res.add(two/one);}

                // cards.remove(i);
                // if(i>j) cards.remove(j);
                // else cards.remove(j-1);
                ArrayList<Double> go =new ArrayList<>();
                for(int k=0;k<cards.size();k++){
                    if(k==i || k==j) continue;
                    go.add(cards.get(k));
                }
                
                // System.out.println("cards after removal:"+go);
                
                for(double d:res){
                    go.add(d);
                    // System.out.println("cards after addition:"+go);
                    if(bt(new ArrayList<>(go))) return true;
                    // System.out.println("Backtracking now to a result of some other operation");
                    go.remove(go.size()-1);
                    // System.out.println("cards after operational removal"+go);
                }
            }
        }
        return false;
    }
}