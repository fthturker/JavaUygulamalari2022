package TernaryStatement;

public class Soru_3 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak asagidaki kodlari yazdiriniz
        a) son basamak 5'e esit ve 5'den buyukse yuvarlama islemi:
        "Son basamagi bir ust ondaliga yuvarla"
        b) son basamak 5'den kucukse yuvarlama islemi:
        "Son basamagi bir alt ondaliga yuvarla"
        Ornegin: 127 ise 130
                 125 ise 130
                 123 ise 120 olacaktir
         */
        int sayi=122;
        String sonuc=sayi%10>=5 ?("Son basamagi bir ust ondaliga yuvarla: " + (sayi/10+1)*10):
                ("Son basamagi bir alt ondaliga yuvarla: "+(sayi/10)*10);
        System.out.println(sonuc);
    }
}
