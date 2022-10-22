package Loops;

public class Soru_5 {
    public static void main(String[] args) {
        /*
        asagidaki goruntuyu bir for dongusu kullanarak elde eden kodu yaziniz
        A A A A A
        A A A A A
        A A A A A
         */
        // 1. yol
        int rows = 3;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            String s = " ";
            for (int j = 1; j <= columns; j++) {
                s = s + " A";
            }
            System.out.println(s);
        }
        System.out.println("====================================");
        //2. yol

        int rowss = 3;
        int columnss = 5;
        int i = 1;
        while (i <= rows) {
            String s = " ";
            for (int j = 1; j <= columns; j++) {
                s = s + " A";
            }
            System.out.println(s);
            i++;
        }
        //3. Yol
        System.out.println("====================================");
        int rowsss = 3;
        int columnsss = 5;
        int l = 1;
        do {
            String s = " ";
            for (int j = 1; j <= columns; j++) {
                s = s + " A";
            }
            System.out.println(s);
            l++;
        }while (l<=rowsss);
    }
}