package SwitchOnStatement;

public class Soru_9 {
    public static void main(String[] args) {
        /*
        Adi "Seasons" olan bie Enum olusturun ve
        Enum da switch-on deyimini kullanarak asagidakileri yazdiriniz

        Kis icin "Snowboard yapmak"
        Yaz ve bahar icin "Balik tutmak"
        Sonbahar icin "Doga yuruyusu yapmak"
         */
        String browser=Seasons.WINTER.toString();
        switch (browser){
            case "WINTER":
                System.out.println("Snowboard yapmak");
                break;
            case "Yaz":
            case "Bahar":
                System.out.println("Balik tutmak");
                break;
            case "Sonbahar":
                System.out.println("Doga yuruyusu yapmak");
                break;
            default:
                System.out.println("Gecersiz data");
        }
    }
    public enum Seasons{
        WINTER,SUMMER,FALL,SPRING
    }
}
