class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> indices = new ArrayList<Integer>();
        int prev = 0;
        for(int curr = heights.length -1; curr >= 0; curr--){
           if(heights[curr] > prev){
               indices.add(curr);
               prev = heights[curr];
           }
        }
        Collections.sort(indices);
        return indices.stream().mapToInt(i -> i).toArray();
    }
}