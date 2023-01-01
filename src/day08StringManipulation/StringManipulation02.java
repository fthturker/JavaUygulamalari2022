package day08StringManipulation;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Example01: Bir String'deki space haric kac tane karakter kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ===> 14

        String str = "Ali okula gitti.";

        // replace() methodu bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ", "").length();

        System.out.println(num);

        //Example02: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";

        String yeniS = s.replace("a", "A");
        System.out.println(yeniS);

        //example03: Bir String'deki tum "kara" kelimesinin yerine "*" koyunuz

        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");

        System.out.println(yeniT);

        //Example04: Bir String'deki yum sayilari "*" a ceviriniz
        //           "AC2211546" ==> AC*******
        String stdId = "AC2211546";

        String yeniStdID = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdID);

        /*
            Bir grup data'yi ifade eden kodlara "Regex" denir
            "Regex" Regular Expressions in kisaltilmis halidir.
            1) Tum rakamlar  ====> [0-9]
            2) Tum kucuk harfler==>[a-z]
            3) Tum buyuk harfler==>[A-Z]
            4) tum harfler========>[a-zA-Z]
            5) Sesli harfler======>[aeiouAEIOU]
            6) Space==============>[ ]
            7) Tum rakamlar ve tum harfler==>[0-9a-zA-Z]
            8) Tum noktalama isaretleri=====>\\p{Punct}

            1)Rakamlar haric tum karakterler==>[^0-9]
            2)Kucuk harfler haric tum karakterler==>[^a-z]
            3)buyuk harfler haric tum karakterler==>[^A-Z]
            4)Tum harfler haric tum karakterler====>[^a-zA-Z]
            5)Space haric===>[^ ]
         */
        // Example05: Verilen bir string de kullanilan noktalama isareti ve rakamlar ve sace karakteri haric
        //            tum karakterlerin sayisini bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();

        System.out.println(sonuc);

        //Example06: Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i) Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        //i) Space haric en az sekiz karakter olmali (Space i sildik digerlerini de 8 den buyuk olduguna baktik)
        boolean first = pwd.replace(" ", "").length() > 7;
        //ii)En az 1 sembol icermeli (Sembol haric digerlerini sildik)
        boolean second = pwd.replaceAll("[0-9a-zA-Z]", "").length() > 0;
        //iii)En az 1 rakam icermeli (rakam haric digerlerini sildik)
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;
        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //v)En az 1 kucuk harf icermeli
        boolean fifty = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean pwdgecerli = first && second && third && fourth && fifty;

        if (pwdgecerli){
            System.out.println("Password gecerlidir");
        }else{
            System.out.println("Password Gecerli Degildir");
        }

        //Example07:Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle="Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

        int number=cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example08: verilen bir String "Al" ile baslayip "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin

        String v="Alex";
        boolean baslangic=v.startsWith("Al");

        boolean bitis=v.endsWith("x");

        String result=baslangic && bitis ? "Harika" : "Normal";

        System.out.println(result);
    }
}
