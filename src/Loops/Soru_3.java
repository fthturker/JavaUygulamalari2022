package Loops;

public class Soru_3 {
    public static void main(String[] args) {
        /*
        Bir String in polindrom olup olmadigini kontrol etmek icin kod yaziniz
        Bir String tersi ile ayniysa buna polindrom denir
        Ornek
         "anna" "123321" polindromlardir
         */
        //1. Yol
        /*
        String s = "runnur";
        String r = "";
        for (int i = s.length() - 1; i > -1; i--) {
            String c = s.substring(i, i + 1);
            r = r + c;
        }
        if (s.equals(r)) {
            System.out.println(s + " polindromdur");
        }else{
            System.out.println(s+ " polindrom degildir");
        }
       */
        /*
        //2. Yol
        String s = "runnur";
        String r = "";
        int i =s.length()-1;
        while (i>-1){
            String c = s.substring(i, i + 1);
            r = r + c;
            i--;
        }
        if (s.equals(r)) {
            System.out.println(s + " polindromdur");
        }else{
            System.out.println(s+ " polindrom degildir");
        }
        */
        //3. Yol
        String s = "runnur";
        String r = "";
        int i =s.length()-1;
        do {
            String c = s.substring(i, i + 1);
            r = r + c;
            i--;
        }while (i>-1);
        if (s.equals(r)) {
            System.out.println(s + " polindromdur");
        }else{
            System.out.println(s+ " polindrom degildir");
        }
    }
}
