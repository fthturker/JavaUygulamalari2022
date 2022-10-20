package SwitchOnStatement;

public class Soru_8 {
    public static void main(String[] args) {
        /*
        bir Enum olusturun ve icine CHROME SAFARİ IE FIREFOX YANDEX gibi tarayici adlarini koyunuz
        switch ifadesini kullanin ve CHROME icin "CHROME kullaniyorum"
        CHROME SAFARİ IE FIREFOX YANDEX ten farkli tarayicilar icin "Gecersiz tarayici" yaziniz
        Not
        gelistirici konsolunda enum olusturmalisiniz
         */
     String browser=Browser.CHROME.toString();
     switch (browser){
         case "CHROME":
             System.out.println("CHROME kullaniyorum");
             break;
         case "SAFARI":
             System.out.println("SAFARI kullaniyorum");
             break;
         case "IE":
             System.out.println("IE kullaniyorum");
             break;
         case "FIREFOX":
             System.out.println("FIREFOX kullaniyorum");
             break;
         case "YANDEX":
             System.out.println("YANDEX kullaniyorum");
             break;
         default:
             System.out.println("Gecersiz tarayici");
     }
    }
    public enum Browser{
        CHROME,SAFARİ,IE,FIREFOX,YANDEX
    }
}
