class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

            for(String s1:strs){
                String key = getPattern(s1);
                List<String> result = map.getOrDefault(key, new ArrayList<>());
                result.add(s1);
                map.put(key, result);
            }
        return map.values().stream().toList();
    }

    String getPattern(String str) {
        int arr[] = new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        return Arrays.toString(arr);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna