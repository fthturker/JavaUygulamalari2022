package SwitchOnStatement;

public class Soru_7 {
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
        d) kullanici mildenKmye saniyedenSaate fahrenaytdanSantigarata dan farkli bir islem girdiginde kodunuz
           "Bu operator o donusturucu icin tanimlanmadi" yazmalidir
         */
        double mil=10;
        double saniye=7200;
        double fahrenayt=83;
        String operator="fahrenaytdanSantigarata";
        switch (operator){
            case "mildenKmye":
                System.out.println(mil*1.60934);
                break;
            case "saniyedenSaate":
                System.out.println((saniye/60)/60);
                break;
            case "fahrenaytdanSantigarata":
                System.out.println((fahrenayt-32)*5/9);
                break;
            default:
                System.out.println("Bu operator o donusturucu icin tanimlanmadi");
        }
    }
}
