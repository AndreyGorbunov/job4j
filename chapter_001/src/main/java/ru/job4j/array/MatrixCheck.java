package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            int countRow = 0;
            int countCell = 0;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][row] == 'X') {
                    countRow = board[row][row] == board[row][cell] ? countRow + 1 : countRow;
                    countCell = board[row][row] == board[cell][row] ? countCell + 1 : countCell;
                }
            }
            if (countRow == board.length || countCell == board.length) {
                result = true;
                break;
            }
        }
        return result;
    }
}
