class Solution {
    public int solution(int n, int k) {
        int serviceDrink = n/10;
        return n*12000 + (k-serviceDrink)*2000;
    }
}