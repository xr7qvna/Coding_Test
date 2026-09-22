class Solution {
    public int solution(String myString, String pat) {
        String str = myString.toLowerCase();
        String pattern = pat.toLowerCase();
        
        if (str.contains(pattern)) {
            return 1;
        } else {
            return 0;
        }
    }
}