package org.ANR_TEAM.Problem_A;

import java.util.List;

class OutputModule {
    public void displayResults(List<String> lines) {

        System.out.println("Result of KWIC indexes:");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
