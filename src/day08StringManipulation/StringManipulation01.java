package day08StringManipulation;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        //Example01: kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz.
        //           Ramazan==> Rn

        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Lutfen isminizi giriniz:");
        String isim = input.next();

        // 1. Yol:
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);
        // yazdiginiz code sadece bazi durumlar icin calisirsa o code'a "Hard Coding" denir.
        // yazdiginiz code her durumlar icin calisirsa o code'a "Dynamic Coding" denir.

        System.out.println("" + ilkHarf + sonHarf);

        // 2. Yol:
        String ilk = isim.substring(0, 1);
        String son = isim.substring(isim.length() - 1);

        System.out.println(ilk + son);

        //Example02: Verilen String'deki tum hayvan isimlerini ekrana yazdiriniz
        //           "Ben kedi, esim tavuk, oglum sever inek"

        String str = "Ben kedi, esim tavuk, oglum sever inek";

        //substring() in iki kullanimi vardir
        //1) substring() baslangic indeksi, bitis indeksi String'in ortasindan bir parca almaya yarar.
        //2) substring() baslangic indeksi String'in verilen indeks'ten sonuna kadar almaya yarar.

        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek = str.substring(34);

        System.out.println(kedi + tavuk + inek);

         */

        //Example03: Ilk isim e soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdirin
        //           Ali Can ===>AC

        System.out.println("Ilk ve soyisminizi giriniz:");
        String tamIsim=input.nextLine();

        String a=tamIsim.substring(0,1);

        String b=tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a+b);
    }
}
