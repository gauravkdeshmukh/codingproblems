class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r <= 0 || c <= 0 || m*n != r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        int rows = 0, cols = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[rows][cols] = mat[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
        
    }
}