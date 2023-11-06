package org.ANR_TEAM.Problem_B;

public class Queen {
    private final int row;
    private final int col;

    public Queen(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isAttacking(Queen other) {
        return (row == other.getRow() || col == other.getCol() ||
                Math.abs(row - other.getRow()) == Math.abs(col - other.getCol()));
    }

}