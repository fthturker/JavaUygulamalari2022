package TernaryStatement;

public class Soru_5 {
    public static void main(String[] args) {
        /*
        nested ternary kullanarak
        sifreyi kontrol etmek icin kodu yaziniz
        8 den fazla karakter iceriyorsa bas harfi 'i' olmalidir
        8 karakterden fazla icermiyorsa bas harfi 'K' olmalidir
         */
        String p="Kxxxxx";
        String r=p.length()>8 ? (p.startsWith("i"))?"Gecerli":"Gecersiz": (p.startsWith("K"))?"Gecerli":"Gecersiz";

        System.out.println(r);
    }
}
