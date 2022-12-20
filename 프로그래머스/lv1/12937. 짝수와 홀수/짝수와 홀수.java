class Solution {
    public String solution(int num) {
        return num%2==0 ? "Even" : "Odd";
    }
    
    public static void main(String[] args) {
        Solution evenOrOdd = new Solution();
        evenOrOdd.solution(2);
    }
}