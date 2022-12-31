package day06NestedIfSwitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
            Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya karar ekrana yazdiriniz
         */
        //Note: toLowerCase() methodu Bir String'deki tum character'leri kucuk harfe cevirir
        //      toUpperCase() methodu Bir String'deki tum character'leri buyuk harfe cevirir

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz...");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz...");
        }
    }
}
