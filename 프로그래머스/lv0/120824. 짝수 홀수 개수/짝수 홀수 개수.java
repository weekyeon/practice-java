class Solution {
    public int[] solution(int[] num_list) {
        int evenCnt = 0;
		int oddCnt = 0;
		for (int num : num_list) {
			if(num%2==0) evenCnt++;
			else oddCnt++;
		}
		int[] answer = {evenCnt, oddCnt};
		return answer;
    }
}