package day04IfStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        Get the firstname, middle name, lasrname, SSN from user then print them like the followimg
        Kullanicidan ilk,orta ve soy ismini aliniz ve asagidaki formatta ekrena yazdiriniz
        Ali Mert Can
        123456789
         */
        // 1. Yol

        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Ilk isminizi giriniz:");
        String ilkIsim = input.next(); // next() methodu kullanicidan string datasi almak icin kullanilir

        System.out.println("Orta isminizi giriniz:");
        String ortaIsim = input.next();

        System.out.println("soyisminizi giriniz:");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz:");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

        // 2. Yol
        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
        String ilk=input.next();
        String orta=input.next();
        String soy=input.next();
        String kimlik=input.next();

        System.out.println(ilk+" "+orta+" "+" "+soy);
        System.out.println(kimlik);
         */
        /*
        next() ile nextLine() in farki nedir?
        nextLine() ==> kullanicidan String in tamamini alir
        next() ==> kullanicidan gelen String in sadece ilk kelimesini alir
         */
        // 3. Yol
        System.out.println("Ilk, orta, soy isminizi giriniz...");
        String tamIsim=input.nextLine();
        System.out.println(tamIsim);

        System.out.println("kimlik numaranizi giriniz: ");
        String kimlikNumarasi=input.next();
        System.out.println(kimlikNumarasi);



    }
}
