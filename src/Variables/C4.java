package Variables;

public class C4 {
    public static void main(String[] args) {
        /*
        Bir String ve iki long data tipinde degisken olusturunuz
        Konsolda bu long degiskenlerin toplamini ve carpimini String ile yazdiriniz
         */
        String x="sonuc";
        long y=10L;
        long z=8L;
        System.out.println("Toplam : "+ x+(y+z));

        System.out.println("Carpim : "+ (x+y*z));
    }
}
