class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int dSum = 0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(i == j || (n-1-j) == i){
                    dSum += mat[i][j];
                }
            }
        }
        return dSum;
    }
}