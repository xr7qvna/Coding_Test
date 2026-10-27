import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();
        for (int d : delete_list) {
            deleteSet.add(d);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}