package kadai.kadai_017;

//子クラス
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {

    public KatoIchiro_Chapter17(String familyName, String givenName, String address) {
    super(familyName, givenName, address);
    }

    //子クラスのメソッド
    @Override
    public void eachIntroduce() {
         System.out.println("名前は" + familyName + "" + givenName + "です");
    }

    @Override
    public void execIntroduce() {
          System.out.println("住所は" + address + "です");
          System.out.println("私はりんごが好きです");

     }

}

