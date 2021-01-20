package com.company;

public class BotAlgorithm {
    private int[] lose = {1, 5, 9, 13, 17};

    int stepBot(int countMatches) {
        int result = 0;

        for (int num : lose) {
            result = countMatches - num;

            if (0 < result && result <= 3) {
                break;
            }

            if (result <= 0) {
                result = 1;
                break;
            }
        }

        return result;
    }
}