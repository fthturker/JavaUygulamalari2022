package StringManipulations;

public class C2 {
    public static void main(String[] args) {
        /*
        kisi isimleri icin 3 String degisken olusturunuz
        Bosluk karakterleri haric 3 isimdeki karakter sayisinin toplamini yazdiriniz

        Ornek= isimler
        Ali Can
        Merve Star
        Mark Tom
        ise konsolda 22 gormelisiniz
         */
        String isim1="Ali Can";
        String isim2="Merve Star";
        String isim3="Mark Tom";
        Integer c1=isim1.replaceAll("\\s","").length();
        Integer c2=isim2.replaceAll("\\s","").length();
        Integer c3=isim3.replaceAll("\\s","").length();
        System.out.println("Bosluk karakteri olmadan 3 ismin toplam karakter sayisi : " +(c1+c2+c3));
    }
}
