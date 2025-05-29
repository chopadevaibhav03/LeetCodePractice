package string;
import java.util.*;
import java.io.*;

class Main {
    // __define-ocg__ comment for the challenge
    public static String StringChallenge(String sen) {
        // Split the string into words, removing all non-alphanumeric characters
        String[] words = sen.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
        String longest = "";
        String varOcg = "zhqdsl9e0"; // ChallengeToken

        // Find the longest word (first one if multiple have the same length)
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Remove characters from longest word that appear in varOcg (case-insensitive)
        StringBuilder finalOutput = new StringBuilder();
        for (char c : longest.toCharArray()) {
            if (varOcg.toLowerCase().indexOf(Character.toLowerCase(c)) == -1) {
                finalOutput.append(c);
            }
        }

        // Return "EMPTY" if the final string is empty, otherwise return the result
        return finalOutput.length() == 0 ? "EMPTY" : finalOutput.toString();
    }

    public static void main(String[] args) {
        // Keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }
}