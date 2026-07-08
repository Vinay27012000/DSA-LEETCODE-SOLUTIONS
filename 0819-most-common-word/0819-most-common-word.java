class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> wordMap = new HashMap<>();

      for (String word : paragraph.toLowerCase().split("[^a-z]+")) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        for (int i = 0; i < banned.length; i++) {
            if (wordMap.containsKey(banned[i])) {
                wordMap.remove(banned[i]);
            }
        }


        return Collections.max(wordMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna