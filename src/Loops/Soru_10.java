package Loops;

public class Soru_10 {
    public static void main(String[] args) {
        // Verilen ondalik sayinin sadece ondalik kısmindaki rakamlarini kendisinden once bir yildiz
        // isaretiyle yazdirmak icin gereken kodu yaziniz
        // Ornegin 75.4238 ----> *4*2*3*8

        // 1. yol
        double num=75.4238;
        String s=String.valueOf(num);
        int idxOfComma=s.indexOf(".");
        String decimalPart=s.substring(idxOfComma+1);
        String t="";
        for (int i = 0; i < decimalPart.length(); i++) {
            String r=decimalPart.substring(i,i+1);
                    t=t+"*"+r;
        }
        System.out.println(t);
    }
}
