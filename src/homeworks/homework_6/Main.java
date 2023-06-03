package homeworks.homework_6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence("Odesa", 's'));

        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apple", "Plant"));

        System.out.println(stringReverse("Hello"));

        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));

        guessTheWord();
    }

    private static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == symbol) {
                count++;
            }
        }
        return count;
    }

    private static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    private static String stringReverse(String str) {
        StringBuilder result = new StringBuilder(str);

        return result.reverse().toString();
    }

    private static Boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(stringReverse(str));
    }

    private static void guessTheWord() {
        String[] words = { "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato" };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomWordIndex = random.nextInt(words.length - 1);

        System.out.println("Computer word is: " + words[randomWordIndex]);
        String computerWord = words[randomWordIndex];

        boolean result = false;

        while (!result) {
            System.out.println("Enter any word: ");

            String userWord = scanner.nextLine();

            if (userWord.equalsIgnoreCase(computerWord)) {
                System.out.printf("Correct answer! The secret word is: %s\nThe user word is: %s\n", computerWord,
                        userWord);
                result = true;
            } else {
                System.out.printf("Wrong answer! Your word is: %s\n", userWord);
                int limit = Math.min(computerWord.length(), userWord.length());

                StringBuilder hiddenWord = new StringBuilder("###############");

                for (int i = 0; i < limit; i++) {
                    char computerChar = computerWord.charAt(i);
                    char userChar = userWord.charAt(i);

                    if (computerChar == userChar) {
                        hiddenWord.setCharAt(i, computerChar);
                    }
                }
                System.out.printf("The secret word is: %s \n", hiddenWord);
            }
        }
    }
}
