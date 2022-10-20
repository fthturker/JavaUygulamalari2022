package SwitchOnStatement;

public class Soru_10 {
    public static void main(String[] args) {
        /*
        myClass isminde bir class oluturunuz
        class ta size rastgele bir alfabetik karakter veren bir yöntem olusturun
        ve ardindan yontemi kullanarak asagidakileri yazdirin
        'A' ve 'a' icin "Ilk karakter" yazdiriniz
        'B' ve 'b' icin "Ikinci karakter" yazdiriniz
        digerleri icin "Diger karakterler"
         */
        String alfabe=getRandomAlphabet().toLowerCase();

        switch (alfabe){
            case "a":
                System.out.println("Ilk karakter");
            case "b":
                System.out.println("Ikinci karakter");
            case "c":
                System.out.println("Ucuncu karakter");
            case "d":
                System.out.println("Dorduncu karakter");
            default:{
                System.out.println("Diger karakterler");
            }
        }


    }

        public static String getRandomAlphabet(){
            String alfabe ="ABCDEFGHIJKLMNOPQRSTUVYWXZabcdefghijklmnoprstuvyxwqz";
            int maxIndex=alfabe.length()-1;
            int randomIndex=(int) Math.round(Math.random()*maxIndex);
            return alfabe.substring(randomIndex,randomIndex+1);
        }
    }

