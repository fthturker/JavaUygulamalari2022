package StringManipulations;

public class C5 {
    public static void main(String[] args) {
        /*
        Bir string degiskeni olusturunuz
        String degiskenin konsolda bosluk olmayan son karakteri yazdiriniz
        Ornek   'Ali Can' icin n yazdirmalisiniz
                'Miami' icin i yazdirmalisiniz
         */
        String yazi = "Ali Can";
        int boslukOlmayansonKarakterIndex = yazi.trim().length() - 1;
        String boslukOlmayansonKarakter = yazi.substring(boslukOlmayansonKarakterIndex, boslukOlmayansonKarakterIndex + 1);
        System.out.println("bosluk Olmayan son Karakter : " + boslukOlmayansonKarakter);
    }
}
