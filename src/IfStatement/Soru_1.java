package IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        /*
        Asagidaki secenekler dogrultusunda gereken kodu yaziniz
        Aralik,Ocak,Subat icin "Kis"
        Mart,Nisan,Mayis icin "Ilkbahar"
        Haziran,Temmuz,Agustos icin "Yaz"
        Eylul,Ekim,Kasim icin "Sonbahar"
        Digerleri icin "Gecersiz ay adi"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String ayAdi = scan.nextLine().toLowerCase();

        if (ayAdi.equals("aralik") || (ayAdi.equals("ocak")) || (ayAdi.equals("subat"))) {
            System.out.println("Kis");
        } else if (ayAdi.equals("mart") || (ayAdi.equals("nisan")) || (ayAdi.equals("mayis"))) {
            System.out.println("Bahar");
        } else if (ayAdi.equals("haziran") || (ayAdi.equals("temmuz")) || (ayAdi.equals("agustos"))) {
            System.out.println("Yaz");
        } else if (ayAdi.equals("eylul") || (ayAdi.equals("ekim")) || (ayAdi.equals("kasim"))) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("Gecersiz ay adi");
        }
    }
}
