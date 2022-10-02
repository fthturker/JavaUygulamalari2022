package StringManipulations;

public class C11 {
    public static void main(String[] args) {
        /*
        Bir String in basinda ve sonunda bosluk karakteri olup olmadigini kontrol etmek icin kod yaziniz
        Ornek
                '   Ali  ' icin kodunuz konsolda false yazmalidir
                'Ali' icin kodunuz konsolda true yazmalidir
         */
        String yazi="Tom";
        String trimlenmis=yazi.trim();
        Boolean sonuc=yazi.equals(trimlenmis);
        System.out.println("basinda ve sonunda bosluk var mi : " +sonuc);
    }
}
