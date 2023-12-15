package kadai.kadai_004;

public class Score_Chapter04 {

public static void main(String[] args) {

  int[] ten;
  double heikin = 0;

  ten = new int[10];

  ten[0]  = 10;
  ten[1]  = 20;
  ten[2]  = 30;
  ten[3]  = 40;
  ten[4]  = 50;
  ten[5]  = 60;
  ten[6]  = 70;
  ten[7]  = 80;
  ten[8]  = 90;
  ten[9]  = 100;

  for (int i = 0; i < ten.length; i++) heikin = heikin + ten[i];
  heikin = heikin / ten.length;

  System.out.println("Aさんの点数は" + ten[0] + "点");
  System.out.println("Bさんの点数は" + ten[1] + "点");
  System.out.println("Cさんの点数は" + ten[2] + "点");
  System.out.println("Dさんの点数は" + ten[3] + "点");
  System.out.println("Eさんの点数は" + ten[4] + "点");
  System.out.println("Fさんの点数は" + ten[5] + "点");
  System.out.println("Gさんの点数は" + ten[6] + "点");
  System.out.println("Hさんの点数は" + ten[7] + "点");
  System.out.println("Iさんの点数は" + ten[8] + "点");
  System.out.println("Jさんの点数は" + ten[9] + "点");
  System.out.println("平均点は" + heikin + "点");



  }
}