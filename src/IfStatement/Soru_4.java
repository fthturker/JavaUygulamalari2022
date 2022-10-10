package IfStatement;

public class Soru_4 {
    public static void main(String[] args) {
        /*
        Asagiidaki secenekler dogrultusunda gereken kodu yaziniz
        a) son basamak 5'e esit ve 5 den buyukse yuvarlama isareti : "Son basamagi bir ust ondaliga yuvarla"
        b) son basamak 5 den kucukse yuvarlama islemi : "Son basamagi bir alt olndaliga yuvarla"
         */

        int sayi=76;
        if (sayi%10>=5){
            System.out.println("Son basamagi bir ust ondaliga yuvarla : " +(sayi/10+1)*10);
        }else{
            System.out.println("Son basamagi bir alt olndaliga yuvarla : " +(sayi/10)*10);
        }

    }
}
