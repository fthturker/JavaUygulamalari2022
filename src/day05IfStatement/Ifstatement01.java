package day05IfStatement;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {
        //Example1: Kullanicidan alinan sayinin cift mi tek mi oldugunu ekrana yazan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s = input.nextInt();

        // 1. Yol
        if (s % 2 == 0) {
            System.out.println("Cift Sayi");
        }

        // "!=" demek "esit degil" demektir.
        if (s % 2 != 0) {
            System.out.println("Tek Sayi");
        }

        // 2. Yol
        if (s % 2 == 0) {
            System.out.println("Cift Sayi");
        } else {
            System.out.println("Tek Sayi");
        }

        // Example2: Bir sayinin negatif, pozitif veya notr oldugunu soyleyen kodu yaziniz
        System.out.println("Bir sayi giriniz...");
        double d = input.nextDouble();

        if (d > 0) {
            System.out.println("Pozitif");
        } else if (d == 0) {
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");
        }

    }
}
