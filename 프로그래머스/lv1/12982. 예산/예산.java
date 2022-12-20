import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int cost : d) {
            if (budget - cost < 0) break;
            budget -= cost;
            answer++;
        }
        return answer;
    }
}