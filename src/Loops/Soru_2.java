package Loops;

public class Soru_2 {
    public static void main(String[] args) {
        /*
        Bir String de tekrarlanan karakterleri yazdirmak icin kod yaziniz
        Ornek
        accessories  ---->  ces
         */
        /*


        String s = "accessories";
        String d = "";
        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;
                }
            }
        }
        System.out.println(d);
*/
        //2. Yol
        String s = "accessories";
        String d = "";
        int i = 0;
        while (i < s.length()) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;
                }
            }
            i++;
        }
        System.out.println(d);

        //3. Yol
        String w = "accessories";
        String e = "";
        int y = 0;
        do {
            String c = w.substring(y, y + 1);
            if (w.indexOf(c) != w.lastIndexOf(c)) {
                if (!e.contains(c)) {
                    e = e + c;
                }
            }
            y++;

        }while (y<w.length());
        System.out.println(e);
    }
}

