package Loops;

public class Soru_4 {
    public static void main(String[] args) {
        /*
        Benzersiz (Tekrarsiz) rakamlari bir tamsayi olarak yazdirmak icin kod yaziniz
        Ornegin
        223878 ---------> 37
         */
        // 1. Yol
        /*
        int num=223878;
        String s=String.valueOf(num);
        String d="";
        for(int i=0;i<s.length();i++){
            String c=s.substring(i,i+1);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                d=d+c;
            }
        }
        System.out.println(d);
        */
        //2. Yol
        int num = 223878;
        String s = String.valueOf(num);
        String d = "";
        int i = 0;
        while (i < s.length()) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                d = d + c;
            }
            i++;
        }
        System.out.println(d);

        //3. yol
        int num1 = 223878;
        String e = String.valueOf(num1);
        String z = "";
        int a = 0;
        do {
            String c = s.substring(a, a + 1);
            if (e.indexOf(c) == e.lastIndexOf(c)) {
                z = z + c;
            }
            a++;
        }while (a < e.length());
        System.out.println(z);
    }
}
