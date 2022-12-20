class Solution {
    public int solution(int n) {
        int pizza = n/7;
		return n%7 > 0 ? pizza+1 : pizza;
    }
}