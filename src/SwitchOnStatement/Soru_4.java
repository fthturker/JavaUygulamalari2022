package SwitchOnStatement;

public class Soru_4 {
    public static void main(String[] args) {
        /*
        Cinsiyet "Erkek" ise "Erkek" yazdiriniz
        Cinsiyet "Kadin" ise "Kiz" yazdiriniz
        Cinsiyet "Erkek" ve "Kadin" dan farkliysa "Digerleri" yazdirin
        not
        bu secenekler disindakilerini yoksayiniz
         */
        String cinsiyet="ERKEK";
        switch (cinsiyet.toLowerCase()){
            case "kadin":
                System.out.println("Kiz");
                break;
            case "erkek":
                System.out.println("Erkek");
                break;
            default:
                System.out.println("Digerleri");
        }
    }
}
