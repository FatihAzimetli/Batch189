package day03wrapperconcatenationoperators;

public class Concatenation {
    public static void main(String[] args) {
        // Bir String ve iki integer variable olusturun . String degeri ile Intiger larin toplamini consola yazdirin

        String a = "Elma";
        int num = 10;
        int num1 = 15;
        System.out.println(a+num+num1);
        System.out.println(a+num*num1);
        System.out.println(a+(num+num1));
        System.out.println(num+num1+a);
        System.out.println(num+a+num1);
    }
}
