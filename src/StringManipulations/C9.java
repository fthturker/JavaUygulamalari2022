package StringManipulations;

public class C9 {
    public static void main(String[] args) {
        /*
        Bir String degiskeni olusturunuz
        konsolda ilk karakter ve son karakter disindaki tum karakterleri buyuk harflerle yazdiriniz
        Ornegin   String 'Java ise konsolda 'AV' yazdirmal,isiniz
         */
        String yazi="Java";
        Integer sonKrktrIndex=yazi.length()-1;
        String ilkSonKrktrDisindakiler=yazi.substring(1,sonKrktrIndex).toUpperCase();
        System.out.println("ilk karakter ve son karakter disindaki tum karakterler : " +ilkSonKrktrDisindakiler);
    }
}
