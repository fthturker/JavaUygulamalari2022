package SwitchOnStatement;

import java.util.ArrayList;
import java.util.List;

public class Soru_3 {
    public static void main(String[] args) {
        /*
        Verilen ay numaralarindan baslayarak tum ay adlarini yazdiran bir kod yaziniz
        Ornek
        Ay numarasi 9 ise konsolda kodunuz Eylul Ekim Kasim Aralik olacaktir
         */
        List<String> gelecekAylar = new ArrayList<>();
        int ayNo = 7;
        switch (ayNo) {
            case 1:
                gelecekAylar.add("Ocak");
            case 2:
                gelecekAylar.add("Subat");
            case 3:
                gelecekAylar.add("Mart");
            case 4:
                gelecekAylar.add("Nisan");
            case 5:
                gelecekAylar.add("Mayis");
            case 6:
                gelecekAylar.add("Haziran");
            case 7:
                gelecekAylar.add("Temmuz");
            case 8:
                gelecekAylar.add("Agustos");
            case 9:
                gelecekAylar.add("Eylul");
            case 10:
                gelecekAylar.add("Ekim");
            case 11:
                gelecekAylar.add("Kasim");
            case 12:
                gelecekAylar.add("Aralik");
                break;
            default:
                break;
        }
        if (gelecekAylar.isEmpty()) {
            System.out.println("Gecersiz ay numarasi");
        } else {
            for (String ayAdi : gelecekAylar) {
                System.out.print(ayAdi + " ");
            }
        }
    }
}
