class Solution {
    public long solution(int a, int b) {
        return result(Math.min(a,b),Math.max(a,b));
    }
    
    public long result(long a, long b){
        return (a+b)*(b-a+1)/2;
    }
}