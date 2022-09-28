package StringManipulations;

public class C6 {
    public static void main(String[] args) {
        /*
        Bir String degiskeni olusturunuz
        String in ilk ve son karakterlerinin ASCII degerlerinin toplamini bulunuz
         */
        String yazi="Miami";
        int sonKrktrIndex=yazi.length()-1; //son karakter
        int ilkKrktrAscii=yazi.charAt(0);  //ilk karakter
        int sonKrktrAscii=yazi.charAt(sonKrktrIndex);
        System.out.println("ilk ve son karakter ASCII degerlerinin Toplami : " +(ilkKrktrAscii+sonKrktrAscii));
    }
}
