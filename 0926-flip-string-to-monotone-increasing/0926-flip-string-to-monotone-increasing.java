class Solution {
    public int minFlipsMonoIncr(String s) {
        int oneCnt = 0;
        int res = 0;
        for(char c : s.toCharArray()){
            if(c == '1')
                oneCnt++;
            else
                res = Math.min(res+1, oneCnt);
        }
        return res;
    }
}