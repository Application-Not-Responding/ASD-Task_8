package org.ANR_TEAM.Problem_B;

import java.util.Scanner;

public class Problem_B_runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boardSize = scanner.nextInt();
        EightQueens solver = new EightQueens(boardSize);
        solver.placeQueens();
        System.out.println("Total solutions: " + solver.solutionsCount);
    }
}
