class Solution {
    public int[] solution(int[] num){
        int[] result = new int[num.length];
        
        for(int i=0; i<num.length; i++){
            result[i] = num[num.length-i-1];
        }
        return result;
    }
}