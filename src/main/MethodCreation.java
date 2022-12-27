package main;

public class MethodCreation {
    // main method icinde kullanacaginiz hersey "static" olmalidir
    public static void main(String[] args) {
        System.out.println(toplamaYap(1.2,5));
        System.out.println(ucSayiyiCarp(1.3,4,5));
        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2,4.5,6));

    }
    // Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a,double b){
        return a+b;
    }
    // Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double ucSayiyiCarp(double a,double b,double c){
        return a*b*c;
    }
    // Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan bir method olusturup sonucu ekrana yazdirin
    public static double ilkIkiyiToplaUcuncuIleCarp(double a,double b,double c){
        return (a+b)*c;
    }
}
