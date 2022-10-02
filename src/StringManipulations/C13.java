package StringManipulations;

public class C13 {
    public static void main(String[] args) {
        /*
        Asagidaki kosullar icin bir parolanin gecerli olup olmadıgını kontrol etmek icin kod yaziniz
        sifre bosluk karakterlerinden farkli olacak sekilde en az 8 karakter icermelidir
        sifrede en az 1 sembol olmalidir
        Ornek
        "A2b!" icin kodunuz konsolda false yazdirmalidir
        "A2b3cdef" icin kodunuz konsolda false yazdirmalidir
        "!1a23b4" icin kodunuz konsolda false yazdirmalidir
        "!1a23b4?es" icin kodunuz konsolda true yazdirmalidir
        "! a b 3 k" icin kodunuz konsolda false yazdirmalidir
        */
        String sifre = "!1a23bmm";
        Boolean enAzSekizKrkMi = sifre.replaceAll("\\s", "").length() >= 8;
        Boolean enAzBirsembolVarMi = sifre.replaceAll("\\s", "").replaceAll("[A-Za-z0-9]", "").length() > 0;
        System.out.println("sifre gecerli mi : " + (enAzSekizKrkMi && enAzBirsembolVarMi));
    }
}
