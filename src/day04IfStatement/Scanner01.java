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
        Scanner input = new Scanner(System.in);
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

    }
}
