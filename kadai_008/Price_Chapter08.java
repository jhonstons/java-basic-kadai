package kadai.kadai_008;

public class Price_Chapter08 {

public static void main(String[] args) {

  int agePrice = 3;
  String price = "3000円";

  switch(agePrice) {
      case 1:
          System.out.println("10代の料金は1000円");
        break;
      case 2:
        System.out.println("20代の料金は2000円");
        break;
      case 3:
        System.out.println("30代の料金は3000円");
        break;
      case 4:
        System.out.println("40代の料金は4000円");
        break;
      case 5:
        System.out.println("50代の料金は5000円");
        break;
      case 6:
        System.out.println("60代の料金は6000円");
        break;
      case 7:
        System.out.println("70代の料金は7000円");
        break;
      case 8:
        System.out.println("80代の料金は8000円");
          break;
      default:
          System.out.println("500円です");
          break;

      }
    }
  }