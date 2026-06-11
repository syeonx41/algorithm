class Solution {
    public String solution(String my_string) {
        String str = my_string;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}