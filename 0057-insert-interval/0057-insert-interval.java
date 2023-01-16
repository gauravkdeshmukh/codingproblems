class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         if(intervals.length < 1) {
            return new int[][]{newInterval};
        }

        int min = newInterval[0];
        int max = newInterval[1];
        
        List<int[]> res = new ArrayList<>();
        int index = 0;
        for(index = 0; index < intervals.length; index++) {
            if(intervals[index][1] < newInterval[0]) {
                res.add(intervals[index]);
            } else {
                break;
            }
        }
        
        for(; index < intervals.length; index++) {
            if(intervals[index][0] > newInterval[1]) {
                break;
            } else {
                min = Math.min(min, intervals[index][0]);
                max = Math.max(max, intervals[index][1]);
            }
        }
        
        res.add(new int[]{min, max});
        
        for(; index < intervals.length; index++) {
            res.add(intervals[index]);
        }
        
        return res.toArray(new int[res.size()][2]);
    }
}