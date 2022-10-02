package StringManipulations;

public class C12 {
    public static void main(String[] args) {
        /*
        Bir String in basinda buyuk harf ve sonunda nokta olup olmadigini kontrol etmek icin kod yaziniz
        Ornek
        "Ali" icin kodunuz konsolda false yazdirmalidir
        "ali." icin kodunuz konsolda false yazdirmalidir
        "    Ali.     "  icin kodunuz konsolda false yazdirmalidir
        "Ali."  icin kodunuz konsolda true yazdirmalidir
        "ALI."  icin kodunuz konsolda true yazdirmalidir
         */
        String yazi = "Tom Hanks.";
        char ilkKrk = yazi.charAt(0);
        char sonKrk = yazi.charAt(yazi.length() - 1);
        Boolean ilkKrkBuyukMu = ilkKrk >= 'A' && sonKrk <= 'Z';
        Boolean sonKrkNoktaMi= sonKrk=='.';
        Boolean ilkKrkBuyukMuSonKrkNoktaMi=ilkKrkBuyukMu && sonKrkNoktaMi;
        System.out.println("ilk karakter buyuk harf , son karakter nokta mi : " +ilkKrkBuyukMuSonKrkNoktaMi);
    }
}
