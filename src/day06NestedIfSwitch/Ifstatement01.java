package day06NestedIfSwitch;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {
        /*
            Type a code, get age from user and decide which stage on it
            Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
            0  -  4  => baby
            5  -  12 => child
            13 -  20 => teanager
            21 -  30 => adult
            else (not expected age)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        byte yas = input.nextByte();

        if (yas < 0) {
            System.out.println("Gecerli yas giriniz");
        } else if (yas <= 4) {
            System.out.println("baby");
        } else if (yas <= 12) {
            System.out.println("child");
        } else if (yas <= 20) {
            System.out.println("tenager");
        } else if (yas <= 30) {
            System.out.println("adult");
        } else {
            System.out.println("tanimlanmamis evre...");
        }
    }
}
