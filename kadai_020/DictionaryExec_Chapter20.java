package kadai.kadai_020;

import java.util.Scanner;

public class DictionaryExec_Chapter20 {
    public static void main(String[] args) {
        Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
        Scanner scanner = new Scanner(System.in);

        String[] wordsToLookup = {"apple", "banana", "grape", "orange"};

        for (String word : wordsToLookup) {
            String meaning = dictionary.getMeaning(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println("辞書に存在しません");
            }
        }
    }
}
