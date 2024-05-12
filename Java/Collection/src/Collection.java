import java.util.*;

public class Collection {

    TreeMap<Character, String> wordsMap = new TreeMap<>();

    public void collectWords() {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word: ");
            String word = s.next();
            wordsMap.put(word.charAt(0), word);
            System.out.println("Do you want to add a new word? \n1. Yes \n2. No");
            int isNext = s.nextInt();
            if (isNext == 1) continue;
            else if (isNext == 2) break;
            else System.out.println("Invalid answer. Please enter 1 or 2");
        }

        entrySet();
        System.out.print("Please enter the character you want display corresponding words : ");
        Character c = s.next().charAt(0);
        printWordsOfGivenLetter(c);
    }

    public void entrySet() {
        System.out.println("Words added:");
        for (Map.Entry<Character, String> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printWordsOfGivenLetter(Character c) {
        System.out.println("Words starting with letter '" + c + "':");
        for (Map.Entry<Character, String> entry : wordsMap.entrySet()) {
            if (entry.getKey() == c || Character.toUpperCase(entry.getKey()) == Character.toUpperCase(c)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
