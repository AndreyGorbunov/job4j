package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++){
            if (board[index][index] == 'X') {
                for (int i = 0; i < board.length; i++) {
                    if ((board[index][i] != board[index][index]) && (board[i][index] != board[index][index])) {
                        result = false;
                        break;
                    } else result = true;
                }
            }
        }
        return result;
    }
}
