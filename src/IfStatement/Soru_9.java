package IfStatement;

public class Soru_9 {
    public static void main(String[] args) {
        /*
        Herhangi iki sayiyla toplama, carpma ve bolme yapan basit bir hesap makinesi olusturmak icin kod yaziniz
        a) kullanici 10.2 ve 5 ve + isaretini girdiginde kodunuz konsolda "Sonuc 15,2" yazmalidir
        b) kullanici 10 ve 5 ve - isaretini girdiginde kodunuz konsolda "Sonuc 5.0" yazmalidir
        c) kullanici 10 ve 5.3 ve * isaretini girdiginde kodunuz konsolda "Sonuc 53.0" yazmalidir
        d) kullanici 10 ve -5 ve / isaretini girdiginde kodunuz konsolda "Sonuc -2.0" yazmalidir
         */

        double a = 10;
        double b = 5;
        String operator = "/";
        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("dogru deger giriniz");
        }


    }
}
