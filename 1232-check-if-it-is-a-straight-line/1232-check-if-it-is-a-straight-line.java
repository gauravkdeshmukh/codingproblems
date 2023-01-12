class Solution {
    public boolean checkStraightLine(int[][] coords) {
        // To be a straight line all points must satisfy y = mx + c condition
        // m = y2 - y1 / x2 - x1
        // c = y - mx
        if(coords.length < 2) return false;
        int x1 = coords[0][0], y1 = coords[0][1], x2 = coords[1][0], y2 = coords[1][1];
        for (int i = 2; i < coords.length; i++) {
            int x3 = coords[i][0], y3 = coords[i][1];
            if ((y1 - y2) * (x1 - x3) != (y1 - y3) * (x1 - x2)) {
                return false;
            }
        }

        return true;
        
    }
}