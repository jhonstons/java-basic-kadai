package kadai.kadai_014;

public class CarExec_Chapter14 {

  private int gear  = 1;
  private int speed = 30;
  private int gearChangeNum = 3;

  //コンストラクタ（初期化処理）
  public CarExec_Chapter14(int gear, int speed) {
     this.speed = speed;
     this.gearChangeNum = gearChangeNum;

     System.out.println("ギア" + this.gear +"から" + this.gearChangeNum + "に切り替えました");
  }

  //【メソッド】ギアをチェンジする
  public void gearChange(final int gearChangeNum) {
    System.out.println("速度は時速" + this.speed + "km");
  }
}

