package StringManipulations;

public class C7 {
    public static void main(String[] args) {
        /*
        bir string degiskeni olusturunuz
        ilk karakteri disindaki tum karakterleri konsolda yazdiriniz
        Ornegin String 'Java' ise konsola 'ava' yazdirmalisiniz
         */
        String yazi="Java";
        String ilkKrktrDisindakiler=yazi.substring(1);
        System.out.println("Ilk Karakter Disindakiler : " +ilkKrktrDisindakiler);
    }
}
