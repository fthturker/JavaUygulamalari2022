package Loops;

public class Soru_9 {
    public static void main(String[] args) {
        /*
        String icindeki tum kucuk harfleri yildiz isaretiyle yazdirmak icin gereken kodu yaziniz
        Ornegin
        'Ali Can?' ===> l*i*a*n*
        */
        // 1. yol
        String s="ALI can?";
        s=s.replaceAll("[a-z]","");
        String t="";
        for (int i = 0; i < s.length(); i++) {
            String r=s.substring(i,i+1);
            t=t+r+"*";
        }
        System.out.println(t);

        // 2. yol
        String w="ALI can?";
        w=w.replaceAll("[a-z]","");
        String e="";
        for (int i = 0; i < w.length(); i++) {
            String y=w.substring(i,i+1);
            e=e+y+"*";
        }
        System.out.println(e);

        // 3. yol
        String b="ALI can?";
        b=b.replaceAll("[a-z]","");
        String j="";
        Integer u=0;
        do {
            String v=b.substring(u,u+1);
            j=j+v+'*';
            u++;
        }while (u<b.length());
        System.out.println(j);
    }
}
