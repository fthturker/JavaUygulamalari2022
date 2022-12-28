package day03;

public class TypeCasting01 {
    // Type Casting: Bir numeric data type'ini diger numeric data type'ine cevirmek demektir.
    //      byte < short < int < long < float < double

    // Note:  Kucuk data type'ini buyuk data type'ina cevirmeye "Auto Widening" denir.
    // Note2: Buyuk data type'ini kucuk data type'ina cevirmeye "Explicit Norrowing" denir.

    public static void main(String[] args) {

        byte age=23;

        int newAge=age;

        long population=1234;
        int newPopulation=(int)population;

        //Example1: short'u double'a ceviren kodu yaziniz
        short numOfstudents=235;
        double newNumOfStudents=numOfstudents; // Auto Widening

        // example2: float'i byte yapan kodu yaziniz
        float price=12.99F;
        byte newPrice=(byte) price; // Explicit Norrowing

        System.out.println(newPrice); // 12 ==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz
                                      //        Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler

        int number=515;
        byte newNumber=(byte) number; //3 ==> Java 515 'i 256(byte daki sayilarin sayisi) ya boldu kalani return etti

        int num=510;
        byte newNum=(byte) num;
        System.out.println(newNum); // -2
    }
}
