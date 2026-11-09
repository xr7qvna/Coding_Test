import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> result = new ArrayList<>();

        for (String row : picture) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < row.length(); i++) {
                char c = row.charAt(i);
                for (int j = 0; j < k; j++) {
                    sb.append(c);
                }
            }
            
            String expandedRow = sb.toString();
            for (int j = 0; j < k; j++) {
                result.add(expandedRow);
            }
        }
        return result.toArray(new String[0]);
    }
}