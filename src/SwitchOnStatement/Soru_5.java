package SwitchOnStatement;

public class Soru_5 {
    public static void main(String[] args) {
        /*
        Belirli bir yilin belirli bir ayindaki gun sayisini goruntulemek icin bir kod yaziniz
        Ornek
        2000 yilinin Subat ayinda gun sayisi 29
         */
        int ay=6;
        int yil=2001;
        int gunSayisi=0;
        switch (ay){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                gunSayisi=31;
                break;
            case 4: case 6: case 9: case 11:
                gunSayisi=30;
                break;
            case 2:
                if ((yil%4==0 && !(yil%100==0)) || (yil%400==0)){
                    gunSayisi=29;
                }else {
                    gunSayisi=28;
                }
                break;
            default:
                System.out.println("Gecersiz ay");
                break;
        }
        System.out.println("Gun sayisi= "+gunSayisi );
    }
}
