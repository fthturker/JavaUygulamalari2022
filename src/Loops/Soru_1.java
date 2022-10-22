package Loops;

public class Soru_1 {
    public static void main(String[] args) {
        /*
        120 den 11 e kadar 4 ile bolunebilen ve 6 ile bolunebilen tum tam sayilari
        aynı satırda iki ardisik tam sayi arasinda bosluk birakarak yaziniz
         */
        //1. Yol
        String s = "";
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + " ";
            }
        }
        System.out.println(s);

        //2. Yol
        String a = "";
        Integer i = 120;
        while (i > 10) {
            if (i % 4 == 0 && i % 6 == 0) {
                a = a + i + " ";
            }
            i--;
        }
        System.out.println(a);

        //3. Yol
        String b="";
        Integer f=120;
        do {
            if (f % 4 == 0 && f % 6 == 0) {
                b = b + f + " ";
            }
            f--;
        }while (f>10);
        System.out.println(b);
    }
}