import java.util.ArrayList;
import java.util.List;

class Solution {
    
    // 문자열을 리스트에 먼저 추가 → 그 다음 재귀로 확장 -> 사전 순서(짧은 게 먼저, 그 다음 한 글자씩 늘어남)
    
    private static final char[] CHARS = "AEIOU".toCharArray();
    
    private List<String> generate(String word){
        List<String> words = new ArrayList<>();
        words.add(word);
        
        if (word.length()==5)
            return words;
        
        for (char c : CHARS){
            words.addAll(generate(word+c));
        }
        return words;
    }
    
    public int solution(String word){
        return generate("").indexOf(word);
    }
}