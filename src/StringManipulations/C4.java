package StringManipulations;

public class C4 {
    public static void main(String[] args) {
        /*
        Bir String degiskeni olusturunuz
        String deki rakam olmayan karakterlerin sayisini konsolda yazdiriniz
        Ornek String : '1a3Bcf4!...' ise konsolda 8 yazdirmaniz gerekir
         */

        String yazi="1a3Bcf4!...";
        Integer rakamOlmayanKrktrSayisi=yazi.replaceAll("[0-9]","").length();
        System.out.println("Rakam Olmayan Karakter Sayisi : " +rakamOlmayanKrktrSayisi);
    }
}
