package day04IfStatement;

public class IfStatement01 {
    public static void main(String[] args) {
        // if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        // Example1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s =12;

        if (s>0){
            System.out.println("Sayi pozitiftir...");
        }
        //Example2: Verilen karakter buyuk harf ise ekrana "Buyuk Harf" yazdirin.
        char ch='F';
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }
        /*
        && islemi sadece boolean ile kulalnalir
            true && true  = true
            true && false = false
            false && true = false
            false && false = false
        && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
        Bir tane false varsa sonuc false demektir
         */

        // Example3: Verilen bir sayi uc basamakli ise ekrana "uc basamaklidir" yazdirin

        int sayi=-100;
        sayi=Math.abs(sayi); // sayi negatif de verilse biz sayiyi mutlak deger olarak pozitif e cevirdik

        if (sayi>99 && sayi<1000){ // sayi>=100 && sayi<=999
            System.out.println("uc basamaklidir");
        }
        //Example4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdirin.
        // "=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
        // Matematikteki esittir sembolu Java'da "==" seklindedir.

        int p=14;
        p=Math.abs(p);
        if (p%2==0){
            System.out.println("Cift Sayi");
        }
        //Example5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika sayi" yazdirin
        int r=250;
        if (r<300 || r>1200){
            System.out.println("Harika sayi");
        }
        /*
        || islemi sadece boolean ile kulalnalir
            true || true  = true
            true || false = true
            false || true = true
            false || false = false

            Note: || isleminde false alabilmek icin her seyin false olmasi gerekir
                  || isleminde sadece sadece bir true sonucu true yapmaya yeter
         */
    }
}
