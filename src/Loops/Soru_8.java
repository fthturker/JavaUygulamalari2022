package Loops;

public class Soru_8 {
    public static void main(String[] args) {
        /*
        20 den 3 e kadar olan tek tam sayilari ayni satirda ardisik olacak sekilde
        aralarinda bosluk birakarak yazdirmak icin gereken kodu yaziniz
         */
        // 1. yol
        String s = "";
        for (int i = 20; i >= 3; i--) {
            if (i % 2 != 0) {
                s = s + i + " ";
            }
        }
        System.out.println(s);
        System.out.println("==========================");
        // 2. yol
        String a = "";
        int d = 20;
        while (d > 2) {
            if (d % 2 != 0) {
                a = a + d + " ";
            }
            d--;
        }
        System.out.println(a);
        System.out.println("==========================");
        //3. yol
        String b = "";
        int c = 20;
        do {
            if (c % 2 != 0) {
                b = b + c + " ";
            }
           c--;
        }while (c>2);
        System.out.println(b);
    }
}