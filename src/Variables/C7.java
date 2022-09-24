package Variables;

import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        /*
        iki tamsayiyi degistirmek icin bir kod yaziniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz :");

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Degistirmeden once : " + n1 + "  -  " + n2);

        System.out.println("----------------------------------------------");

        // 1. Yol : 3. degisken kullanarak
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Degistirdikten Sonra : " + n1 + "  -  " + n2);

        System.out.println("----------------------------------------------");

        // 2. Yol : 3. degisken kullanmadan
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Degistirdikten Sonra : " + n1 + "  -  " + n2);
    }
}
