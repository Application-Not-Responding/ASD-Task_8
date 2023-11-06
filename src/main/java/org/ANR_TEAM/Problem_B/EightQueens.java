package org.ANR_TEAM.Problem_B;

public class EightQueens {
    private final Queen[] queens;
    long solutionsCount;
    private final int boardSize;

    public EightQueens(int boardSize) {
        this.boardSize = boardSize;
        queens = new Queen[boardSize];
        solutionsCount = 0;
    }

    public void placeQueens() {
        placeQueens(0);
    }

    private void placeQueens(int row) {
        if (row == boardSize) {
            solutionsCount++;
        } else {
            for (int col = 0; col < boardSize; col++) {
                Queen queen = new Queen(row, col);
                boolean safe = true;

                for (int i = 0; i < row; i++) {
                    if (queens[i].isAttacking(queen)) {
                        safe = false;
                        break;
                    }
                }

                if (safe) {
                    queens[row] = queen;
                    placeQueens(row + 1);
                }
            }
        }
    }
}
