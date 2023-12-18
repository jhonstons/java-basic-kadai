package kadai.kadai_017;

//親クラスの作成
public class Kato_Chapter17 {


  public String familyName;
  public String givenName;
  public String address;


 //コンストラクタ
 public Kato_Chapter17 (String familyName, String givenName, String address) {
    this.familyName = familyName;
    this.givenName = givenName;
    this.address = address;
  }

 //親クラスが持つメソッド
 public void commonIntroduce() {
   System.out.println("名前は" + familyName + givenName + "です");
   System.out.println("住所は" + address + "です");
}
 public void eachIntroduce() {
   System.out.println();
}
 public void execIntroduce() {
   System.out.println();
}

    public static void main(String[] arge) {
   KatoTaro_Chapter17 taro = new KatoTaro_Chapter17("加藤", "太郎", "東京都中野区〇×");
   taro.eachIntroduce();
   taro.execIntroduce();
   System.out.println();

   KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17("加藤", "一郎", "東京都中野区〇×");
   Ichiro.eachIntroduce();
   Ichiro.execIntroduce();
   System.out.println();

   KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17("加藤", "花子", "東京都中野区〇×");
   Hanako.eachIntroduce();
   Hanako.execIntroduce();

    }
 }
