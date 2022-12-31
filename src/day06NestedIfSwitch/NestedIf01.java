package day06NestedIfSwitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
            Password'un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
            Password'un ilk harfi kucuk ise
                'z' olursa gecerli password aksi halde gecersiz password

            Note: Java "nested" kodlari calistirilirken cok zaman harcar,
                  buna "Time Complexity" denir. Bu yuzden nested kod yazmamaya calisiriz.
         */

        String pwd="Axy12";
        char ilkHarf=pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z'){
                if (ilkHarf=='z'){
                    System.out.println("Gecerli password");
                }else{
                    System.out.println("Gecersiz password");
                }
        }else{
            System.out.println("Ilk karakter harf olmalidir");
        }
    }
}
