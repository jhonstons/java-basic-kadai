package kadai.kadai_014;

  public class Car_Chapter14 {

  private int gear  = 1;
  private int speed = 30;

  //コンストラクタ（初期化処理）
  public Car_Chapter14(int gear, int speed) {
      this.gear  = gear;
      this.speed = speed;
  }

  //【メソッド】ギアをチェンジする
  public void gearChange(final int afterGear) {

    if(afterGear == 1){
         speed = 10;
      }
      else if(afterGear == 2){
        speed = 20;
      }
      else if(afterGear == 3){
        speed = 30;
      }
      else if(afterGear == 4){
        speed = 40;
      }
      else if(afterGear == 5){
        speed = 50;
      }
      else { speed = 10; }

      System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
      gear = afterGear;

    }
  public void run() {
    System.out.println("速度は時速" + this.speed + "km");
    }
  }


