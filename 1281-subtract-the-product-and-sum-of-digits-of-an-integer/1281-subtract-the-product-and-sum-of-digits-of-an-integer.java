class Solution {
    public int subtractProductAndSum(int n) {
        int rem, sum=1;
        int ans=0;
        while(n > 0) {
            
            rem = n%10;
            sum = sum*rem;
            ans = ans+rem;
            n /= 10;
        }
       
        return sum-ans;
    }
}