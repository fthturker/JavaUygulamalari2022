package StringManipulations;

public class C3 {
    public static void main(String[] args) {
        /*
        bir String degiskeni olusturunuz
        String deki toplam alfabetik ve sayisal karakter sayisini konsolda yazdiriniz

        Ornek String: 'Miami 33018!!!' ise konsolda 10 yazdirmaniz gerekir
         */
        String yazi = " Miami 33018!!! ";
        int karakterSayisi = yazi.replaceAll("\\s", "").replaceAll("[A-Z a-z0-9]", "").length();
        System.out.println("Toplam alfabetik ve sayisal karakter sayisi : " + karakterSayisi);
    }
}
