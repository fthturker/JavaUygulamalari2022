package IfStatement;

public class Soru_6 {
    public static void main(String[] args) {
        /*
        Mili km ye saniyeyi saate fahrenhayti santigrata ceviren bir donusturucu olusturmak icin kod yaziniz
        google dan donusumler icin formulleri bulunuz

        a) kullanici mile degerini 10 ve operatoru mildenKmye olarak girdiginde
           konsolda kodunuz "16 km" yazmalidir (sayi dinamik olacak)
        b) kullanici saniye degerini 7200 ve operatoru saniyedenSaate olarak girdiginde
           konsolda kodunuz "2" yazmalidir (sayi dinamik olacak)
        c) kullanici fahrenheit degerini 83 ve operatoru fayrenaytdanSantigrata olarak girdiginde
           konsolda kodunuz "28.3333 santigrat" yazmalidir (sayi dinamik olacak)
         */
        double mil =10;
        double saniye=7200;
        double fahrenayt=83;
        String operator="mildenKmye";

        if (operator.equals("mildenKmye")){
            System.out.println(mil*1.609304);
        }else if (operator.equals("saniyedenSaate")){
            System.out.println((saniye/60)/60);
        }else if (operator.equals("fayrenaytdanSantigrata")){
            System.out.println((fahrenayt-32)*5/9);
        }else
            System.out.println("dogru deger giriniz");
    }
}
