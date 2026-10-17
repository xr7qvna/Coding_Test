class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        int max = 0;

        for (String str : strArr) {
            int len = str.length();
            count[len]++;
            if (count[len] > max) {
                max = count[len];
            }
        }

        return max;
    }
}