class Solution {
    public int solution(int[] array) {
        int count = 0;
        
        for (int num : array) {
            String s = String.valueOf(num);
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '7') {
                    count++;
                }
            }
        }
        
        return count;
    }
}