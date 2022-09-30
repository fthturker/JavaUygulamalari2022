package StringManipulations;

public class C10 {
    public static void main(String[] args) {
        /*
        Bir String in ortadaki herhangi bir konumda yalnizca
        tek bir bosluk karakteri olup olmadigini kontrol etmek icin kod yaziniz
        Ornegin
        'Ali        Can' icin konsolda false yazilmalidir
        '   Ali Can ' icin konsolda false yazilmalidir
        '   Ali     Can     ' icin konsolda false yazilmalidir
        'Ali Can' icin konsolda true yazilmalidir
         */
        String yazi="Tom    Hanks";
        String trimlenmis=yazi.trim();
        String hicBoslukYok=trimlenmis.replaceAll("\\s","");
        Boolean ortadaTekboslukVarMi=trimlenmis.length()-hicBoslukYok.length()==1;
        System.out.println("ortada tek Bosluk Var : " +ortadaTekboslukVarMi);
    }
}
