class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String[] pv = {"", "Thousand", "Million", "Billion"};
        String res = "";
        int i = 0;
        while(num > 0){
            if(num % 1000 != 0)
                res = toWords(num % 1000)+pv[i]+" "+res;
            num /= 1000;
            i++;
        }
        return res.trim();
    }
        
    private String toWords(int n){
        String res = "";
        String[] ones_tens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] hundreds = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if(n == 0)
            res = "";
        else if(n < 20)
            res = ones_tens[n % 20]+" ";
        else if(n < 100)
            res = hundreds[n / 10]+" "+toWords(n % 10);
        else
            res = ones_tens[n / 100]+" Hundred "+toWords(n % 100);
        return res;
    }
        
}