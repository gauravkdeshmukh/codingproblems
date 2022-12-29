class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer =  new ArrayList<String>();
        for(int i=1; i <= n ; i++) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        String text = "";
        if(divisibleBy3  && divisibleBy5){
            text = "FizzBuzz";
        } else if(divisibleBy3){
            text = "Fizz";
        } else if(divisibleBy5){
            text = "Buzz";
        } 
        if(divisibleBy3 || divisibleBy5){
            answer.add(text);
        }else {
            answer.add(String.valueOf(i));
        }
    }    
        return answer;
    }
}