class Solution {
    public int maxArea(int[] heights) {
      int maxArea = 0;
      int a = 0;  
      int b = heights.length - 1;  
      while(a != b){
        int minHeight = Math.min(heights[a], heights[b]);  
        int area = minHeight * (b-a);
        maxArea = Math.max(maxArea, area);
        if(minHeight == heights[b]) b = b - 1;
        else a = a + 1;  
      }
        return maxArea;
    }
}