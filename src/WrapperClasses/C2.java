package WrapperClasses;

public class C2 {
        public static void main(String[] args) {
        /*
        data tipi String olan "103" degerini byte data tipine donusturmek icin bir kod yaziniz
        ve yine data tipi String olan "2351" degerini short data tipine donusturup
        konsolda iki degisken arasindaki farki yazdiriniz
         */

        byte sayi1 = Byte.parseByte("103");
        short sayi2 = Short.parseShort("2351");
        System.out.println("Fark : " + (sayi2 - sayi1));

        System.out.println("---------------------------------");

        byte sayi3 = 103;
        short sayi4 = 2351;
        System.out.println("Fark : " + (sayi2 - sayi1));

    }
}
