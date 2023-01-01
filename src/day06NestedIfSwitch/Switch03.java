package day06NestedIfSwitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Note: switch de sadece int,byte, short, char ,String data tiplerini kullanabiliriz
        //Note: Eger 3 den fazla durum varsa switch() tercih ederim

        // kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir
        // hesap makinasi yapiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz: +, -, *, % ");
        char islem = input.next().charAt(0);

        System.out.println("Ilk sayiyi giriniz:");
        double ilk = input.nextDouble();

        System.out.println("Ikinci sayiyi giriniz:");
        double ilkinci = input.nextDouble();

        switch (islem) {
            case '+':
                System.out.println(ilk + ilkinci);
                break;
            case '-':
                System.out.println(ilk - ilkinci);
                break;
            case '%':
                System.out.println(ilk % ilkinci);
                break;
            case '*':
                System.out.println(ilk * ilkinci);
                break;
            default:
                System.out.println("Bu islem tanimlanmamis...");
        }
    }
}
