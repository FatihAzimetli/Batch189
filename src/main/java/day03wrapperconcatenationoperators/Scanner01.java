package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner klastan obje olustur
        // kullaniciya ne istedigine dair mesaj giriniz
        // uygun metodu kullanarak kullanicindan alinan bilgi memoriye ilistirilir

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");

          byte age =   input.nextByte();

        System.out.println("age = " + age);

    }
}
