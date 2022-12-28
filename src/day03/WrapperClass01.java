package day03;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
                Java Primitive lere methodlar ekleyerek yeni bir yapi olusturdu,
                bu yapiya "Wrapper Class" denir.

                Primitive        Wrapper
                byte       ==>   Byte
                short      ==>   Short
                **int      ==>   Integer
                long       ==>   Long
                float      ==>   Float
                double     ==>   Double
                boolean    ==>   Boolean
                **char     ==>   Character
         */

        byte primitiveByte = 12; // "primitiveByte" yazip nokta koydugumuzda hic method goremeyiz, cunku primitive'ler method icermez sadece deger icerir.
        Byte wrapperByte = 12;  // "wrapperByte" yazip nokta koydugumuzda bircok method goruruz, cunku wrapper'ler method icerir.

        //Example: byte data Type'nin en kucuk ve en buyuk degerlerini ekrana yazdiriniz
        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); //  127

        //Example2: short,int,long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // "primitive"ler nasil "wrapper"lara cevrilir (Autoboxing)
        float f1 = 13.99F;

        Float wrapperF1 = f1;

        // "wrapper"lar nasil "primitive"lere cevrilir(Unboxing)
        Character w1 = 's';

        char primitiveW1 = w1;

        // Note: Autoboxing ve Unboxing Java tarafından otomatik olarak yapilir
    }
}
