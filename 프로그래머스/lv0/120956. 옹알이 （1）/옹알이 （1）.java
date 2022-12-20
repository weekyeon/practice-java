class Solution {
    public int solution(String[] babbling) {
        String[] pron = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String w : babbling) {
        	for (String p : pron) {
        		w = w.replaceAll(p, " ");
        	}
        	if (w.trim().length() == 0) answer++;
        }
        
        return answer;
    }
}