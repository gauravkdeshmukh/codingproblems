class Solution {
    public int[] sortArray(int[] nums) {
        int offset = 50000;
        int freq[] = new int[100005];
        for(int element : nums){
            freq[element+offset]++;
            System.out.print(""+ freq[element+offset]);
        }
        
        System.out.println("");
        
        int index=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
             nums[index++] = i-offset;
                System.out.print("" + (i-offset));        
                freq[i]--;
            }
        }
        
        return nums;
    }
}