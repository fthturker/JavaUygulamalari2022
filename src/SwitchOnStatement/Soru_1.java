package SwitchOnStatement;

public class Soru_1 {
    public static void main(String[] args) {
        /*
        yazdirmak icin switch ifadesini kullaniniz
        a) Aralik, Ocak, Subat icin "Kis"
        b) Mart, Nisan, Mayis icin "Ilkbahar"
        c) Haziran, Temmuz, Agustos icin "Yaz"
        d) Eylul, Ekim, Kasim icin "Sonbahar"
        e) digerleri icin "Gecersiz ay adi"
         */
        String ayadi="nisan";
        ayadi=ayadi.toLowerCase();

        switch (ayadi){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kis");
            break;

            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("İIlkbahar");
                break;

            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;

            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz ay adi");
                break;
        }
    }
}
