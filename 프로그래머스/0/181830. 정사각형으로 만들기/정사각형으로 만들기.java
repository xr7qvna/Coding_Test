class Solution {
    public int[][] solution(int[][] arr) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        if (rowLen == colLen) {
            return arr;
        }
        int max = Math.max(rowLen, colLen);
        int[][] answer = new int[max][max];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}