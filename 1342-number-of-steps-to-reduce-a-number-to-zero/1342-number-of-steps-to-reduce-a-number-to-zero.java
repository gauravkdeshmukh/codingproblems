class Solution {
    public int numberOfSteps(int num) {
        int numSteps = 0;
        int n = num;
        while(n != 0){
            numSteps += 1;
            if(n % 2 == 0){
                n /= 2;
            }else{
                n -= 1;
            }
        }
        return numSteps;
    }
}