package IfStatement;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
        /*
        Verilen BMI degerleri icin Vucut Kitle Indeksi (BMI) ile ilgili mesajlari yazdirmak icin kod yaziniz
        Gecersiz BMI < 0
        Zayif <1.85
        Normal agirlik=18.5 - 24.9
        Fazla kilolu=25 - 29.9
        Obezite = 30 ve daha buyuk BMI
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("BMI degerinizi giriniz");
        double bmi=scan.nextDouble();

        if (bmi<0){
            System.out.println("Gecersiz BMI degeri");
        }else if (bmi<18.5){
            System.out.println("Zayif");
        }else if (bmi<24.9 && bmi>=18.5){
            System.out.println("Normal agirlik");
        }else if (bmi<29.9 && bmi>=25){
            System.out.println("Fazla kilolu");
        }else if (bmi>30){
            System.out.println("Obezite");
        }else {
            System.out.println("dogru deger giriniz");
        }

    }
}




