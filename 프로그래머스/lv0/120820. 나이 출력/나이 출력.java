import java.util.Calendar;

class Solution {
    public int solution(int age) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int answer = (year - age)+1;
        return answer;
    }
}