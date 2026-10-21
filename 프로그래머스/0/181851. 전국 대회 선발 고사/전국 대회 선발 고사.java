class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        int[] selected = new int[3];
        int count = 0;
        for (int r = 1; r <= n; r++) {
            for (int i = 0; i < n; i++) {
                if (rank[i] == r) {
                    if (attendance[i]) {
                        selected[count++] = i;
                    }
                    break;
                }
            }
            if (count == 3) {
                break;
            }
        }
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
    }
}