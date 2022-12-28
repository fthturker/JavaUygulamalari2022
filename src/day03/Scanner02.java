package day03;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // Example1: Sayilari kullanicidan alan ve toplama yapan kodu yaziniz
        //1. Adim: Scanner Class'indan object olustur
        Scanner input=new Scanner(System.in);
        //2. Adim:Kullniciya ne yapacagini soyle
        System.out.println("Ilk sayiyi giriniz...");
        double sayi1=input.nextDouble();

        System.out.println("Ikinci sayiyi giriniz...");
        double sayi2=input.nextDouble();

        System.out.println("Toplam Sonuc: "+(sayi1+sayi2));
    }
}
