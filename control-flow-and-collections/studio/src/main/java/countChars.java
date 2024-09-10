import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countChars {
    public static void main(String[] args) {
        HashMap<Character,Integer> letters = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userString = input.nextLine().toUpperCase();
        char[] charactersInString = userString.toCharArray();

        for (Character letter : charactersInString) {
            Integer charCount = 0;

            for (int i = 0; i < userString.length(); i++) {
                if (userString.charAt(i) == letter) {
                    charCount ++;
                    letters.put(letter,charCount);
                }
            }
        }
        for (Map.Entry<Character,Integer> count : letters.entrySet()) {
            System.out.println(count.getKey() + ":" + count.getValue());
        }
    }
}
