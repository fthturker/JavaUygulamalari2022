package day03;

import java.util.Scanner;

public class scanner03 {
    public static void main(String[] args) {
        // kullanicidan bir dikdortgenin en ve boyunu alıp alan ve cevresini hesaplayan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz...");

        int en=input.nextInt();

        System.out.println("Dikdortgenin uzun kenarini giriniz...");
        int boy=input.nextInt();

        System.out.println("Alan: " +en*boy);

        System.out.println("Cevre: " +2*(en+boy));
    }
}
