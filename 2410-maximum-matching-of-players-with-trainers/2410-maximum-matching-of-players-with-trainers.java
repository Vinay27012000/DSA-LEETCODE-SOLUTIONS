class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        int j=0;

        for (int i=0;i<players.length;i++) {
            while(j<trainers.length && players[i]>trainers[j]) {j++;}
            if (j<trainers.length && players[i]<=trainers[j]) {
                count ++;j++;
            }
            if(j == trainers.length) return count;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna