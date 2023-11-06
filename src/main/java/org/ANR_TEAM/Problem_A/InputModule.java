package org.ANR_TEAM.Problem_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InputModule {
    public List<String> readInputData() {

        List<String> inputLines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text:");

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            inputLines.add(line);
        }

        return inputLines;
    }
}
