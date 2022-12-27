package main;

public class Variables {
    // Variables nasil olusturulur

    // 1) Access Modifier 2) Data Type 3) Variable ismi
    // 4) =  5) Deger 6) ;
    // java'da ";" ingilizcede "." gibidir
    // ingilizce'de "cumle" deriz, Java'da "statement" deriz
    // "=" sembolu "Assigment Operator" olarak adlandirilir
    // "Assigment(Atama) Operator" --> sagdaki degeri alır soldakinin icine koyar

    public int age = 13;

    public int height = 183;

    // Java'da Data Type'lari
    /*
            Primitive(ilkel) Data Types
    1) int: Integer'in kısaltmasi. Integer tam sayi demektir. 32 bit kullanir
            Matematik'de tam sayilarin basi ve sonu yoktur. Fakat Java'da tam sayilarin basi ve sonu vardir
            En kucuk int:-2,147,483,648
            En buyuk int: 2,147,483,647
    2) byte: Tamsayilar icin kullanilir. 8 bit kullanir
            En kucuk byte: -128
            En buyuk byte:  127

   3) short: Tamsayilar icin. 16 bit kullanir
            En kucuk byte: -32768
            En buyuk byte:  32767

   4) long: Tamsayilar icin. 64 bit kullanir
            En kucuk byte: -9,223,372,036,854,755,808
            En buyuk byte:  9,223,372,036,854,755,808

   5) float: Ondaliklı sayilar icindir. 32 bit kullanir
            "float" virgulden sonra 7 basamak icerebilir
            "float" degerlerinde sona "f" veya "F" koymamiz gerekir

   6) double: Ondaliklı sayilar icindir. 64 bit kullanir
            "double" virgulden sonra 16 basamak icerebilir

   7) boolean: true veya false degerleri icin kullanilir. 1 bit kullanir.

   8) char: Tek karakter icin kullanilir.
            "char" lara deger verirken, degeri tek tirnak arasina koyunuz. Yoksa hata verir.

    Note: numeric data types: byte<short<int <long<float<double
            Numeric olmayan Data Types: boolean - char

            Non-Primitive Data Types
     String: isim,adres,kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
                String degerleri mutlaka cift tirnak arasina konulmalidir.
                String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

    Primitive ile Non-Primitive lerin farki nedir?
    1) Non-Primitive data type'larinda degerin yaninda method'lar vardir
       Primitive data type'larinda ise sadece deger vardir, method yoktur.
    2) Primitive data type'leri Java tarafindan olusturulmustur, toplam 8 tanedir, biz primitive data olusturamayiz
       Non-Primitive data type'leri Java tarafindan da olusturulmustur, biz de olusturabiliriz.
       Non-Primitive lersayilamayacak kadar coktur, cunku her developer Non-Primitive data type olusturabilir
    3) Primitive data type isimler kucuk harflerle baslar.
       Non-Primitive data type isimleri buyuk harfle baslar
    4) Primitive data type ler memory'de farkli buyuklukte yerler kullanır
       Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar

     */

    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceShort = 13.99F;

    public double weightOfCell = 0.00024;

    //siz long demenize ragmen Java verilen sayiyi "int" kabul eder
    // bu yuzden, long bir variable'a "int" aralıgının disinda bir sayi verirseniz mulaka sonuna "L" veya "l" koyunuz
    public long populationOfWorld = 70000000000L;

    // burada "L" koymadigimiz halde problem yok cunku "123" int araligina uyar.
    public long x = 123;

    public boolean isOld = true;

    public char initial = 'S';

    public String name="Tom Hanks";

    // Note: "main method" arabanın motoru gibidir
    //       "main method" calismadan hicbir sey calismaz
    public static void main(String[] args) {

    }

}
