package IfStatement;

public class Soru_7 {
    public static void main(String[] args) {
        /*
        Tam isim icin dilbilgisi kurallarini kontrol etmek icin kodu yaziniz
        a) kodunuz "ali Can" , "Ali can" , "ali can" icin "Bas harflerinde hata" yazmalidir
        b) kodunuz asadaki gibi tek kelimeler icin "Ad veya soyadi eksik" yazmalidir
        c) "Ali" veya "Can" veya "ali" kodunuz "ALI CAN" gibi tum formatlar icin "Format hatasi" yazmalidir
        d) kodunuz bir veya daha fazla bosluk (" " veya "" gibi karakterler) icin "Isim girilmedi" yazmalidir
        e) ad, harfler ve boslujtan baska herhengi bir karakteri iceriyorsa kodunuz "Gecersiz Ad" yazmalidir

        Not: kisaltmada 1 den fazla hata varsa ilgili tum hata mesajlari cikti olarak konsolda gorunmelidir
             Ornegin: "ali3" icin kodunuz "Bas harflerinde hata" "Ad veya soyadi eksik" ve "Gecersiz Ad"
         */

        String isim="Ali Can";
        String adinIlkHarfi=isim.substring(0,1);
        Integer boslukIndex=isim.trim().indexOf(' ');
        int indexOfSpace = 0;
        String soyadinIlkHarfi=isim.substring(indexOfSpace+1,indexOfSpace+2);
        Boolean adınIlkHarfiBuyukMu=(adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
        Boolean soyadinIlkHarfiBuyukMu=(soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');
        if (boslukIndex==-1){
            System.out.println("Ad veya soyad eksik");
        }
        if (!(adınIlkHarfiBuyukMu || soyadinIlkHarfiBuyukMu)){
            System.out.println("Bas harflerinde hata");
        }
        if (isim.equals(isim.toLowerCase())){
            System.out.println("Format hatasi");
        }
        if (isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi");
        }
        if (isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz isim");
        }

    }
}
