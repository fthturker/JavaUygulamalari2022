package StringManipulations;

public class C8 {
    public static void main(String[] args) {
        /*
        Bir string degiskeni olusturunuz
        son karakteri disindaki tum karakterlerini konsolda buyuk harfle yazdiriniz
        Ornegin String 'Java' ise konsola 'JAV' yazdirmalisiniz
         */
        String yazi="Java";
        Integer sonKrktrIndex=yazi.length()-1;

        String sonKrktrDisindaki=yazi.substring(0,sonKrktrIndex).toUpperCase();
        System.out.println("son karakter disindaki tum karakterler : " +sonKrktrDisindaki);
    }
}
