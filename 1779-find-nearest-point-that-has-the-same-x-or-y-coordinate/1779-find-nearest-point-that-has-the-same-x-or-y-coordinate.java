class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int dist = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<points.length; i++){
            int x2 = points[i][0];
            int y2 = points[i][1];
            if (x == points[i][0] || y == points[i][1]) {
            int manDi = Math.abs(x- x2) + Math.abs(y - y2);
            if(manDi < dist){
                dist = manDi;
                index = i;
            }
          }
        }
        return index;
    }
}