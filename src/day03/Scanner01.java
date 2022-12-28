package day03;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        // scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi saglar
        // Scanner bir Java Class'idir, bu class'i kullanabilmek icin "import" etmek gerekir.
        // Scanner class2i Java nin util kutuphanesindedir.

        //kullanicidan dataalmak icin yapilmasi gerekenler

        // 1. adim: scanner class'indan object olusturun
        Scanner input =new Scanner(System.in);

        // 2. Adim: Kullaniciya ne yapacagini soyle
        System.out.println("Kullanici yasini gir...");

        // 3. Adim: kullanicidan aldiginiz data2yi bir variable'in icine koyun.
        byte age=input.nextByte();

        System.out.println("Kullanicinin yasi: "+age);
    }
}