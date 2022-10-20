package SwitchOnStatement;

public class Soru_6 {
    public static void main(String[] args) {
        /*
        Switch ifadesini kullanarak
        herhangi bir 2 sayiyla toplama cikarma carpma ve bolme yapan
        basit bir hesap makinesi olusturmak icin kod yaziniz
         a) kullanici 10.2 ve 5 ve + isaretini girdiginde kodunuz konsolda "Sonuc 15.2" yazmalidir
        b) kullanici 10 ve 5 ve - isaretini girdiginde kodunuz konsolda "Sonuc 5.0" yazmalidir
        c) kullanici 10 ve 5.3 ve * isaretini girdiginde kodunuz konsolda "Sonuc 53.0" yazmalidir
        d) kullanici 10 ve -5 ve / isaretini girdiginde kodunuz konsolda "Sonuc -2.0" yazmalidir
        e) kullanici 10 ve -5 girdiginde + - * / den farkli bir islem yaptiginda kodunuz "Gecersiz Islem" yazmalidir
         */
        double sayi1 = 10.2;
        double sayi2 = 5;
        String operator = "*";
        switch (operator) {

            case "":
                System.out.println(sayi1 + sayi2);
                break;
            case "-":
                System.out.println(sayi1 - sayi2);
                break;
            case "*":
                System.out.println(sayi1 * sayi2);
                break;
            case "/":
                System.out.println(sayi1 / sayi2);
                break;
            default:
                System.out.println("Gecersiz Islem");
        }
    }
}
