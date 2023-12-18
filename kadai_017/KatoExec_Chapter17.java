package kadai.kadai_017;

public class KatoExec_Chapter17 {

  public String familyName;
  public String givenName;
  public String address;

  public KatoExec_Chapter17(String familyName, String givenName, String address) {
     this.familyName = familyName;
     this.givenName  = givenName;
     this.address    = address;
      }

   public void commonIntroduce() {
      System.out.println("名前は" + familyName + "" + givenName + "です");
      System.out.println("住所は" + address + "です");

      }
    }


