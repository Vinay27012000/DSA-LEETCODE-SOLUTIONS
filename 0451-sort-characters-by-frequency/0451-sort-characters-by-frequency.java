class Solution {
    
    public String frequencySort(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        if(s.length()<3) return s;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
              map.entrySet().stream()       .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry -> sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue())));
				
        return sb.toString();
    }
}