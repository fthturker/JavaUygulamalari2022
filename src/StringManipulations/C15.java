package StringManipulations;

public class C15 {
    public static void main(String[] args) {
        /*
        String gomlekFiyat="$12.99";
        String kitapFiyat="$35.99";
        gomlek ve kitap fiyatlarinin toplamini bulmak icin gereken kodu yaziniz
         */
        String gomlekFiyat="$12.99";
        String kitapFiyat="$35.99";

        String s=gomlekFiyat.replaceAll("[$.]","");
        String b=kitapFiyat.replaceAll("[$.]","");
        double x=Double.valueOf(s);
        double y=Double.valueOf(b);
        System.out.println("gomlek ve kitap fiyat toplami : " +(x+y)/100);


    }
}
