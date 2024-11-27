class Solution {
    public boolean isValidSudoku(char[][] board) {
    // Boolean arrays to track seen numbers in rows, columns, and subgrids
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] subgrids = new boolean[9][9];

        // Traverse the board
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char current = board[row][col];

                // Skip empty cells
                if (current == '.') {
                    continue;
                }

                int num = current - '1'; // Convert char '1'-'9' to index 0-8
                int subgridIndex = (row / 3) * 3 + (col / 3);

                // Check if num is already seen in the current row, column, or subgrid
                if (rows[row][num] || cols[col][num] || subgrids[subgridIndex][num]) {
                    return false; // Invalid board
                }

                // Mark num as seen
                rows[row][num] = true;
                cols[col][num] = true;
                subgrids[subgridIndex][num] = true;
            }
        }

        // All checks passed, board is valid
        return true;
    }
}