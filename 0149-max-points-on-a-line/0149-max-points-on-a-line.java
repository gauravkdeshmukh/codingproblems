class Solution {
    public int maxPoints(int[][] points) {

        int result = 1;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                int count = 2;

                for (int k = j + 1; k < points.length; k++) {
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    int x3 = points[k][0];
                    int y3 = points[k][1];

                    if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
                        count++;
                    }
                }

                result = Math.max(result, count);
            }
        }

        return result;
    }
}