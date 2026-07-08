class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> wordMap = new HashMap<>();
        Set<String> setA = new HashSet<>();
        for(String str : banned) {
            setA.add(str);
        }
         String result = null;
        int max = -1;
      for (String word : paragraph.toLowerCase().split("[^a-z]+")) {
            if (!word.isEmpty() && !setA.contains(word)) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            
            if (max < wordMap.get(word)) {
                max = wordMap.get(word);
                result = word;
            }
            }
        }

        // for (int i = 0; i < banned.length; i++) {
        //     if (wordMap.containsKey(banned[i])) {
        //         wordMap.remove(banned[i]);
        //     }
        // }

       

        // for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
        //     if (entry.getValue() > max) {
        //         max = entry.getValue();
        //         result = entry.getKey();
        //     }
        // }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna