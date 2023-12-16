package kadai.kadai_011;

public class Prime_Chapter11 {

  public static void main(String[] args) {

    int num = 101;

    boolean[] array = new boolean[num];

    for(int i = 0; i < num; i++) {
     array[i] = true;
    }

    for(int i = 2; i < 101; i++) {
      for(int j = 2; j < i ; j++) {
            if(i % j == 0) {
               array[i] = false;
                 break;
        }
      }
    }
    for(int i = 2; i < 101; i++) {
      if(array[i]) {
        System.out.println(i);
      }
    }
  }
}
