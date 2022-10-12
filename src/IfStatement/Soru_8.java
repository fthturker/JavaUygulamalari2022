package IfStatement;

public class Soru_8 {
    public static void main(String[] args) {
        /*
        ABD deki eyalet kisaltmalarinin bicimini kontrol etmek icin kod yaziniz
        a) kisaltma 2 den fazla karakter iceriyor ise kodunuz
           "Eyalet kisaltmalari 2 karakterden fazla olamaz" yazmalidir
        b) kisaltmada kucuk harfler var ise kodunuz "Eyalet kisaltmalari kucuk harf icermez" yazmalidir
        c) kisaltmanin harflerinden farkli karakterler var ise kodunuz
           "Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez" yazmalidir

        Not: kisaltmada 1 den fazla hata varsa ilgili tum hata mesajlari yazdirilmalidir
        ornek "fl3" icin kodunuz
        "Eyalet kisaltmalari 2 karakterden fazla olamaz"
        "Eyalet kisaltmalari kucuk harf icermez"
        "Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez" yazmalidir
         */

        String eyaletKisaltma="FD";
        if (eyaletKisaltma.length()>2){
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz");
        }
        if (eyaletKisaltma.replaceAll("[a-z]","").length()!=0){
            System.out.println("Eyalet kisaltmalari kucuk harf icermez");
        }
        if (eyaletKisaltma.replaceAll("[A-Za-z]","").length()!=0){
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez");
        }
    }
}
