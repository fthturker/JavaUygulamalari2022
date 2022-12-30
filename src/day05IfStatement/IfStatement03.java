package day05IfStatement;

import java.util.Scanner;

public class IfStatement03 {
    /*
        iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        Ikı tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
            i)equals()==> Buyuk harf ve kucuk harf onemser  "A" ile "a" farklidir
            ii)equalsIgnore()===> Buyuk harf ve kucuk harfi onemsemez  "A" ile "a" aynidir
     */

    public static void main(String[] args) {
        //Example1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz
        //          Pazartesi==>Hafta ici           Pazar==>Hafta sonu

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");
        String gunIsmi = input.next();

        // 1. Yol
        if (gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici...");
        } else if (gunIsmi.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici...");
        } else if (gunIsmi.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici...");
        } else if (gunIsmi.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici...");
        } else if (gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        // 2. Yol
        if (gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }
        // 3. Yol
        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else if (haftaIci) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }
    }
}
