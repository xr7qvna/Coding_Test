import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        int index = 0;
        for (int num : set) {
            if (index >= k) {
                break;
            }
            answer[index++] = num;
        }
        return answer;
    }
}