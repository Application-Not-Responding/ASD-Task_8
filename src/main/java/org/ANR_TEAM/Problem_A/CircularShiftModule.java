package org.ANR_TEAM.Problem_A;

import java.util.ArrayList;
import java.util.List;

class CircularShiftModule {
    public List<String> circularShift(List<String> lines) {

        List<String> shiftedLines = new ArrayList<>();

        for (String line : lines) {
            String[] words = line.split(" ");
            int wordCount = words.length;

            for (int i = 0; i < wordCount; i++) {
                StringBuilder shiftedLine = new StringBuilder();

                for (int j = i; j < i + wordCount; j++) {
                    shiftedLine.append(words[j % wordCount]).append(" ");
                }

                shiftedLines.add(shiftedLine.toString().trim());
            }
        }

        return shiftedLines;
    }
}
