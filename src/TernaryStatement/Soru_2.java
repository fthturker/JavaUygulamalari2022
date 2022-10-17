package TernaryStatement;

public class Soru_2 {
    public static void main(String[] args) {
        /*
        Tennary kullanarak asagidaki kodlari konsolda yazdiriniz
        a) bir ucgenin iki kebarinin uzunlugu esitse "İkizkenar Ucgen"
        b) bir ucgenin tum kenarlarinin uzunlugu esitse "Eskenar Ucgen"
        c) a ve b kosullari saglanmiyorsa "Cesit Kenar Ucgen"
         */
        int a=8;
        int b=9;
        int c=5;

        String ucgenTipi= a==b && b==c ? "Eskenar Ucgen" :
                (a==b && b!=c || a==c && b!=c || b==c && a!=c ? "İkizkenar Ucgen" :
                        "Cesit Kenar Ucgen");
        System.out.println(ucgenTipi);
    }
}
