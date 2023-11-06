package org.ANR_TEAM.Problem_A;

import java.util.List;

public class Problem_A_runner {
    public static void main(String[] args) {

        InputModule inputModule = new InputModule();
        CircularShiftModule circularShiftModule = new CircularShiftModule();
        AlphabeticalSortModule alphabeticalSortModule = new AlphabeticalSortModule();
        OutputModule outputModule = new OutputModule();

        List<String> inputLines = inputModule.readInputData();

        List<String> shiftedLines = circularShiftModule.circularShift(inputLines);

        List<String> sortedLines = alphabeticalSortModule.sortAlphabetically(shiftedLines);

        outputModule.displayResults(sortedLines);
    }
}

