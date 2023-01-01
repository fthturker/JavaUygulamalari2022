package day07TernaryStringManipulation;

public class NestedTrenary01 {
    public static void main(String[] args) {
        /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
            i) Yil 100 e bolunurse 400 e de bolunmelidir.  1600+   1800-
            ii)Yil 100'e bolunmezse 4 e bolunmelidir       1996+   2002-
         */
        int year=2002;
        String leap=year%100==0 ? (year%400==0 ? "Leap Year" : "Leap Year degil") : (year%4==0 ? "Leap Year" : "Leap Year degil");
        System.out.println(leap);

        /*
            Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
            i)  sekiz karakterden fazla ve sekiz karakter varsa ilk harfi 'i' olmalidir.
            ii) sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.
         */
        String pwd="i2a3ed54";

        char ilkHarf=pwd.charAt(0);

        String gecerli=pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli": "Gecersiz") : (ilkHarf=='i' ? "Gecerli": "Gecersiz");
        System.out.println(gecerli);

    }
}
