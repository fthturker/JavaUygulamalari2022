package Loops;

public class Soru_6 {
    public static void main(String[] args) {
        /*
        asagidaki goruntuyu for dongusu kullanarak elde eden kodu yaziniz
        A
        A A
        A A A
        A A A A
         */
        // 1. yol
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            String s = "";
            for (int j = 1; j <= i; j++) {
                s += " A";
            }
            System.out.println(s);
        }
        System.out.println("====================================");
        // 2. yol
        int rowss = 4;
        int i = 1;
        while (i <= rowss) {
            String a = "";
            for (int k = 1; k <= i; k++) {
                a += " A";
            }
            System.out.println(a);
            i++;
        }
        System.out.println("====================================");
        // 3. yol
        int rowsss=4;
        int z =1;
        do {
            String b = "";
            for (int k = 1; k <= z; k++) {
                b+= " A";
            }
            System.out.println(b);
            z++;
        }while (z<=rowsss);
    }
}
