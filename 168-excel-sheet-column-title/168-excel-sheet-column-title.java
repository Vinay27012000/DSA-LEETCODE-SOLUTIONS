class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber > 0){
            columnNumber--;
            int x = (columnNumber) % 26;
            res = (char)(x + 'A') + res;
            columnNumber /= 26;
        }
        return res;
    }
}