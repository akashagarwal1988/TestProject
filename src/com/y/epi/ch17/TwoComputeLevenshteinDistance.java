package com.y.epi.ch17;

/**
 * Created by akasha on 2/6/16.
 */
public class TwoComputeLevenshteinDistance {

    public static int computeLevenshteinDistance(String word1, String word2) {
        int[][] distance = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            distance[i][0] = i;
        }
        for (int i = 0; i <= word2.length(); i++) {
            distance[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    distance[i][j] = distance[i - 1][j - 1];
                } else {
                    distance[i][j] = 1 + Math.min(distance[i - 1][j], Math.min(distance[i][j - 1], distance[i - 1][j - 1]));
                }
            }
        }
        return distance[word1.length()][word2.length()];
    }
}
