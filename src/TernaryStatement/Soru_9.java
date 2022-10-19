package TernaryStatement;

public class Soru_9 {
    public static void main(String[] args) {
        /*
        ternary kullanarak
        konsolda tek sayilar icin "Tek" cift sayilar icin "Cift" yazdiriniz
         */
        int sayi=13;
        String sonuc=sayi%2==0 ? "Cift" : "Tek";
        System.out.println(sonuc);
    }
}
