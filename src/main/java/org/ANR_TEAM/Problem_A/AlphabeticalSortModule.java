package org.ANR_TEAM.Problem_A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AlphabeticalSortModule {
    public List<String> sortAlphabetically(List<String> lines) {
        List<String> sortedLines = new ArrayList<>(lines);
        Collections.sort(sortedLines);
        return sortedLines;
    }
}
