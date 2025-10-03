// Last updated: 10/3/2025, 2:11:54 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);Arrays.sort(trainers);

        int i=0;
        int j=0;
        int placed=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                placed++;
                i++;j++;
            }
            else{
                j++;
            }
        }
        return placed;

    }
}