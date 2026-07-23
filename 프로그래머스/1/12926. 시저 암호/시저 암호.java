class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
           if (c == ' ') {
               sb.append(c);
            }
            else{
                char offset = Character.isUpperCase(c) ? 'A' : 'a';
                int position = c - offset;
                position = (position + n) % 26;
                char result = (char) (position + offset);
                sb.append(result);
            }
        }
        return sb.toString(); 
    }
}