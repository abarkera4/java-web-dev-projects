import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int integer : integerArray) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
        PhraseArrays.phraseArrays();
        System.out.println(sumEven(integerList));
        printFive();
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printFive() {
        Scanner input = new Scanner(System.in);
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");

        ArrayList<String> wordsList = new ArrayList<>();
        for (String word: words) {
            wordsList.add(word);
        }

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String word : wordsList) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }

    }
}
