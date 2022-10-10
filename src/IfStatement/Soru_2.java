package IfStatement;

public class Soru_2 {
    public static void main(String[] args) {
        /*
    Asagidaki secenekler dogrultusunda gereken kodu yaziniz
    a) sifre bosluk karakterlerinden farkli en az 8 karakter iceriyorsa "Gecerli Sifre"
    b) herhangi bir pozisyonda sifrede bosluk karakteri varsa "Sifrede bosluk karakteri kullanmayiniz"
    c) a ve b kosullarinin saglanmamasi durumunda "Gecersiz Sifre"
    Not: Cozumdeki kosullarin siralarina dikkat ediniz
     */

        String sifre="a1b2c4d";
        if (sifre.replaceAll("\\S","").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else if (sifre.replaceAll("\\s","").length()>=8){
            System.out.println("Gecerli Sifre");
        }else{
            System.out.println("Gecersiz Sifre");
        }

    }
}
