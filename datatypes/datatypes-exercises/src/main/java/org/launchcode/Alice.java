package org.launchcode;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?";
        Scanner findTerm = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String findAlice = findTerm.next();

        if (firstSentence.toLowerCase().contains(findAlice)) {
            System.out.println("True");

            int index = firstSentence.indexOf(findAlice);
            int length = findAlice.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        } else {
            System.out.println("No instances of your search term were found.");
        }
    }
}
