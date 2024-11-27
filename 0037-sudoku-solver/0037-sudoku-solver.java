class Solution {
public static void solveSudoku(char[][] board) {
        boolean progress = true;

        // Keep solving until no more cells can be filled using the sum property
        while (progress) {
            progress = fillSingleMissingCells(board);
        }

        // Use backtracking to solve remaining cells
        backtrack(board);
    }

    private static boolean fillSingleMissingCells(char[][] board) {
        boolean progress = false;

        // Fill rows with one missing number
        for (int row = 0; row < 9; row++) {
            int missingCount = 0;
            int missingCol = -1;
            int sum = 0;
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    missingCount++;
                    missingCol = col;
                } else {
                    sum += board[row][col] - '0';
                }
            }
            if (missingCount == 1) {
                board[row][missingCol] = (char) ('0' + (45 - sum));
                progress = true;
            }
        }

        // Fill columns with one missing number
        for (int col = 0; col < 9; col++) {
            int missingCount = 0;
            int missingRow = -1;
            int sum = 0;
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') {
                    missingCount++;
                    missingRow = row;
                } else {
                    sum += board[row][col] - '0';
                }
            }
            if (missingCount == 1) {
                board[missingRow][col] = (char) ('0' + (45 - sum));
                progress = true;
            }
        }

        // Fill 3x3 blocks with one missing number
        for (int block = 0; block < 9; block++) {
            int missingCount = 0;
            int missingRow = -1, missingCol = -1;
            int sum = 0;
            int startRow = (block / 3) * 3;
            int startCol = (block % 3) * 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = startRow + i;
                    int col = startCol + j;
                    if (board[row][col] == '.') {
                        missingCount++;
                        missingRow = row;
                        missingCol = col;
                    } else {
                        sum += board[row][col] - '0';
                    }
                }
            }
            if (missingCount == 1) {
                board[missingRow][missingCol] = (char) ('0' + (45 - sum));
                progress = true;
            }
        }

        return progress;
    }

    private static boolean backtrack(char[][] board) {
        // Find the next empty cell
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    // Try placing digits 1-9
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (backtrack(board)) {
                                return true;
                            }
                            board[row][col] = '.'; // Undo placement
                        }
                    }
                    return false; // No valid number can be placed
                }
            }
        }
        return true; // Puzzle solved
    }

    private static boolean isValid(char[][] board, int row, int col, char num) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 block
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true; // Number can be placed
    }
}