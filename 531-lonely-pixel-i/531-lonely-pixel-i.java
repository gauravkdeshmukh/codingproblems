class Solution {
    public int findLonelyPixel(char[][] picture) {
        int count = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if (picture[i][j] == 'B') {
                    if (isRowLonely(i, j, picture) && isColumnLonely(i, j, picture)) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    boolean isRowLonely(int row, int col, char[][] picture) {
        for (int i = 0; i < picture[0].length; i++) {
            if (i == col)
                continue;

            if (picture[row][i] == 'B')
                return false;
        }
        
        return true;
    }
    
    boolean isColumnLonely(int row, int col, char[][] picture) {
        for (int i = 0; i < picture.length; i++) {
            if (i == row)
                continue;
            
            if (picture[i][col] == 'B')
                return false;
        }
        
        return true;
    }
}