package StringManipulations;

public class C01 {
    public static void main(String[] args) {

        /*
        sadece tek bir kelimeden olusan sehir isimleri icin bir String degiskeni olusturun
        Sehir ismini bas harfi buyuk ve diger tum karakterleri kucuk olacak sekilde konsolda yazdiriniz

        Ornek=  mIAMI-Miami
                miami-Miami
                MIAMI-Miami
                mIami-Miami vb.
         */
        String sehirIsmi="iZMIR";
        String konsolSehirIsmi=sehirIsmi.trim().toLowerCase();
        konsolSehirIsmi=konsolSehirIsmi.substring(0,1).toUpperCase()+konsolSehirIsmi.substring(1);
        System.out.println(konsolSehirIsmi);

    }
}
