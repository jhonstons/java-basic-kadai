package kadai.kadai_020;

import java.util.HashMap;
import java.util.Map;


public class Dictionary_Chapter20 {
  private Map<String, String> words;

  public Dictionary_Chapter20() {
      words = new HashMap<>();

      // 単語と意味を辞書に追加する
      words.put("apple", "りんご");
      words.put("peach", "桃");
      words.put("banana", "バナナ");
      words.put("lemon", "レモン");
      words.put("pear", "梨");
      words.put("kiwi", "キウィ");
      words.put("strawberry", "いちご");
      words.put("grape", "ぶどう");
      words.put("muscat", "マスカット");
      words.put("cherry", "さくらんぼ");
  }

  public String getMeaning(String word) {
      return words.get(word);
  }

  public static void main(String[] args) {
    Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
      String[] wordsToLookup = {"apple", "banana", "grape", "orange"};

      for (String word : wordsToLookup) {
          System.out.print("調べる単語: " + word + " -> ");
          String meaning = dictionary.getMeaning(word);
          if (meaning != null) {
              System.out.println(word + "の意味は" + meaning);
          } else {
              System.out.println("辞書に存在しません");
            }
        }
    }
}