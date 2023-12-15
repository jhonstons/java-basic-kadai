package kadai.kadai_011;

public class Prime_Chapter11 {

  public static void main(String[] args) {

    int start = 2;
    int end   = 100;
    int count = 0;
    boolean[] array = new boolean[start];

    for(int i = start; i < end; i++) {
    boolean isPrime = true;

    for(int j = 2; j < i; j++) {
    if(i%j == 0) {
    isPrime = false;
    break;
      }
    }
    if(isPrime) {
      System.out.println(i);
      }
    }
  }
}