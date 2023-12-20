package kadai.kadai_024;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {

  private String myChoice;
  private String opponentChoice;

  public String getMyChoice() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("自分のじゃんけんの手を入力してください:");
    System.out.println("グーはrockのrを入力しましょう");
    System.out.println("チョキはscissorsのsを入力しましょう");
    System.out.println("パーはpaperのpを入力しましょう");

    String input = scanner.nextLine().toLowerCase();
    if (input.equals("r") || input.equals("s") || input.equals("p")) {
      myChoice = input;
    } else {
        System.out.println("正しい手を入力してください");
        getMyChoice();

    }
    return myChoice;
  }

  public String getRandom() {
    String [] choices = {"r", "s", "p"};
    Random rand = new Random();
    int index = rand.nextInt(3);
    opponentChoice = choices[index];
    return opponentChoice;

  }

  public void playGame(String myHand) {
    HashMap<String,String> hands = new HashMap<>();
    hands.put("r", "グー");
    hands.put("s", "チョキ");
    hands.put("p", "パー");

    String opponentHand = getRandom();
    System.out.println("自分の手は" + hands.get(myHand) + "、対戦相手の手は" + hands.get(opponentHand));
    if (myHand.equals(opponentHand)) {
        System.out.println("あいこです");
    } else if ((myHand.equals("r") && opponentHand.equals("s")) ||
              (myHand.equals("s") && opponentHand.equals("p")) ||
              (myHand.equals("p") && opponentHand.equals("r"))) {
        System.out.println("自分の勝ちです");
    } else {
      System.out.println("自分の負けです");
    }
  }
}