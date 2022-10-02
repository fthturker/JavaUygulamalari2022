package StringManipulations;

public class C14 {
    public static void main(String[] args) {
        /*
        Bir String in belirli bir tek karaktere sahip olup olmadigini uc farkli sekilde kontrol etmek icin kod yaziniz
         */
        // 1. Yol
        String yazi="Java";
        Boolean sonuc=yazi.contains("v");
        System.out.println("karakteri iceriyor mu : " +sonuc);

        //2. Yol
        String yazi1="Java";
        Boolean sonuc1=yazi1.replaceAll("[v]","").length()>0;
        System.out.println("karakteri iceriyor mu : " +sonuc1);

        //3. Yol
        String yazi2="Java";
        Boolean sonuc2=yazi2.indexOf("v")!=-1;
        System.out.println("karakteri iceriyor mu : " +sonuc2);

    }
}
