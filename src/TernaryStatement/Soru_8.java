package TernaryStatement;

public class Soru_8 {
    public static void main(String[] args) {
        /*
        sayi 3 basamakli ise konsolda kodunuz "Bu sayi 3 basamaklidir" olacaktir
        Aksi takdirde kodunuz "Bu sayi 3 basamakli degildir" olacaktir
         */
        // 1. yol
        int sayi=-956;
        String sonuc=(sayi>99 && sayi<1000) || (sayi>-1000 && sayi<-99) ?
                "Bu sayi 3 basamaklidir" : "Bu sayi 3 basamakli degildir";
        System.out.println(sonuc);

        // 2. yol
        int sayi1=65;
        sayi1=Math.abs(sayi1);
        String sonuc1=(sayi1>99 && sayi1<1000) ? "Bu sayi 3 basamaklidir" : "Bu sayi 3 basamakli degildir";
        System.out.println(sonuc1);
    }
}
