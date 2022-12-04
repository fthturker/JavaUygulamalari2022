package Loops;

public class Soru_7 {
    public static void main(String[] args) {
        /*
        asagidaki carpim tablosunu olusturmak icin kod yaziniz
        3*1=3
        3*2=6
        3*3=9
        3*4=12
        3*5=15
        3*6=18
        3*7=21
        3*8=24
        3*9=27
        3*10=30
         */
        // 1. yol
        int num = 3;
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
        System.out.println("===========================");
        //2. yol
        int num1 = 3;
        int i = 1;
        while (i < 11) {
            System.out.println(num1 + "x" + i + "=" + num1 * i);
            i++;
        }
        System.out.println("===========================");

        // 3. yol
        int num2=3;
        int a=1;
        do {
            System.out.println(num2 + "x" + a + "=" + num2 * a);
            a++;
        }while (a<11);

    }
}
