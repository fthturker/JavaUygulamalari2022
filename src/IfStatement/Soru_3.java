package IfStatement;

public class Soru_3 {
    public static void main(String[] args) {
        /*
        Ayin numarasini girdiginizde ayin adini yazdirmak icin gerejen kodu yaziniz
        Ornek 1 icin "Ocak" 2 icin cikti "Subat"
         */

        int ayNo = 4;

        if (ayNo == 1) {
            System.out.println("Ocak");
        } else if (ayNo == 2) {
            System.out.println("Subat");
        } else if (ayNo == 3) {
            System.out.println("Mart");
        } else if (ayNo == 4) {
            System.out.println("Nisan");
        } else if (ayNo == 5) {
            System.out.println("Mayis");
        } else if (ayNo == 6) {
            System.out.println("Haziran");
        } else if (ayNo == 7) {
            System.out.println("Temmuz");
        } else if (ayNo == 8) {
            System.out.println("Agustos");
        } else if (ayNo == 9) {
            System.out.println("Eylul");
        } else if (ayNo == 10) {
            System.out.println("Ekim");
        } else if (ayNo == 11) {
            System.out.println("Kasim");
        } else if (ayNo == 12) {
            System.out.println("Aralik");
        } else {
            System.out.println("Gecersiz ay numarasi");
        }

    }
}
