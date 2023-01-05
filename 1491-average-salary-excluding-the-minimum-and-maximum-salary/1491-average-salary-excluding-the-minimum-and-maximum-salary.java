class Solution {
    public double average(int[] salary) {
     Arrays.sort(salary);
     double sum = 0;
     int i=0;   
     for(i=1; i< salary.length-1;i++){
         sum += salary[i];
     }
     return sum/(i-1);    
    }
}