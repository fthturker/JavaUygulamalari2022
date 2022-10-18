package TernaryStatement;

public class Soru_4 {
    public static void main(String[] args) {
        /*
        nested ternary kullanarak apex kodunu yaziniz
        bir yilin artik yil olmadıgını kontrol eden bir program yaziniz
        yil 100 e tam bolunuyorsa 400 e tam bolunmelidir
        bir yil 100 e tam bolunemiyorsa 4 e tam bolunebilmelidir
         */
        int yil=1990;
        String artikYilMi=(yil%100==0)?((yil%400==0)?("Artik yil"):("Artik yil degil")):
                        ((yil%4==0)?("Artik yil"):("Artik yil degil"));
        System.out.println(artikYilMi);
    }
}
