package IfStatement;

public class Soru_5 {
    public static void main(String[] args) {
        /*
        asagidaki sev-cenekler dogrultusunda gereken kodu yaziniz
        a) Bir ucgenin iki kenarinin uzunlugu esitse "ikizkenar ucgen
        b) bir ucgenin tum kenarlarinin uzunlugu esitse "eskenar ucgen"
        c) a ve b kosullari saglanmiyorsa "cesitkenar ucgen"
         */
        int a=5;
        int b=5;
        int c=5;

        if (a==b && b==c){
            System.out.println("eskenar ucgen");
        }else if (a==b && b!=c || a==c && b!=c || b==c && a!=c){
            System.out.println("ikizkenar ucgen");
        }else {
            System.out.println("cesitkenar ucgen");
        }
    }
}
