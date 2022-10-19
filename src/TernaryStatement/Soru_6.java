package TernaryStatement;

public class Soru_6 {
    public static void main(String[] args) {
        /*
        Bir sayinin mutlak degerini hesaplamak icin kodu yaziniz
        pozitif sayilar ve sifir mutlak deger icin sayi ile aynidir
        negatif sayilarin mutlak degerini bulmak icin sayiyi -1 ile carpiniz
         */
        int sayi = -5;
        int sonuc = sayi < 0 ? -1 * sayi : sayi;

        System.out.println(sonuc);
    }
}
