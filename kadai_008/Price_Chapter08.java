package kadai.kadai_008;

public class Price_Chapter08 {

public static void main(String[] args) {

  int userAge = 3;
  int serviceCost = 3000;

  switch(serviceCost) {
      case 1,1000:
        System.out.println("10代の料金は1000円");
        break;
      case 2,2000:
        System.out.println("20代の料金は2000円");
        break;
      case 3,3000:
        System.out.println("30代の料金は3000円");
        break;
      case 4,4000:
        System.out.println("40代の料金は4000円");
        break;
      case 5,5000:
        System.out.println("50代の料金は5000円");
        break;
      case 6,6000:
        System.out.println("60代の料金は6000円");
        break;
      case 7,7000:
        System.out.println("70代の料金は7000円");
        break;
      case 8,8000:
        System.out.println("80代の料金は8000円");
          break;
      default:
          System.out.println("500円です");
          break;

      }
    }
  }