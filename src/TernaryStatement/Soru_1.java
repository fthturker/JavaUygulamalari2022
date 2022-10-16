package TernaryStatement;

public class Soru_1 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak kodlari konsolda yazdiriniz
        Parola bosluk karakterinden farkli olarak en az 8 karakter iceriyorsa "Gecerli Parola"
        Parola bosluk karakterinden farkli olarak en az 8 karakterden daha az ise "Gecersiz Parola"
         */
        String parola = "a1b2c3d4";
        String gecerliMi = parola.replaceAll("\\s", "").length() > 7 ? "Gecerli Parola" : "Gecersiz Parola";
        System.out.println(gecerliMi);
    }
}
