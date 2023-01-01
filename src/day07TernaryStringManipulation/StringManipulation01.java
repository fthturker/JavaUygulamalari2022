package day07TernaryStringManipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
                        String Class Methodlari

            1)equals(): i) iki tane String'in ayni olup olmadigini anlamamiza yarar.
                        ii)equals() method'u "boolean" return eder.
            2)equalsIgnoreCase(): i) iki tane String'in ayni olup olmadigini buyuk harf kucuk harf dikkat etmeden anlamamiza yarar
                                  ii)equalsIgnoreCase(9 method'u "boolean" return eder.
            3)toLowerCase(): i) Bir String'in tum harfleri kucuk harfe cevirmek icin kullanılir
                             ii)toLowercase() methodu "String" return eder
            4)toUpperCase(): i) Bir String'in tum harfleri buyuk harfe cevirmek icin kullanılir
                             ii)toUppercase() methodu "String" return eder
            5)charAt(): i) Bir String'den bellli bir indeksdeki karakteri almak icin kullanilir.
                        ii) charAt() method'u "char" return eder.
            6)lenght(): i) Bir String'de kac tane karakter kullanildigini ogrenmek icin kullanilir.
                        ii) lenght() method'u "int" return eder.
            7)contains(): i)Bir String'de belli bir karakterin veya karakterlerin var olup olmadigini anlamak icin kullanilir.
                          ii)contains() method'u "boolean" return eder.
            8)split(): i)Bir String'i istedigimiz karakterden parcalamaya yarar.
                       ii) split() method'u "Array" return eder.
         */
        /*
            Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                i) en az 8 karaker icermeli
                ii) Space karakteri icermemeli
                iii) Ilk harf "M" veya "m" olmali
                iv) Son karakter "?" olmali
         */
        String pwd = "Manisa12?";

        // i) en az 8 karaker icermeli
        boolean first = pwd.length() > 7;

        // ii) Space karakteri icermemeli
        boolean second = !pwd.contains(" ");

        // iii) Ilk harf "M" veya "m" olmali
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'm';

        // iv) Son karakter "?" olmali
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';

        System.out.println(first & second & third & fourth);
    }
}
