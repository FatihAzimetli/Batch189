package Day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*Kullanicidan
        * adini ve soyadini
        * yasini
        * boyunu
        * kilosunu
        * medeni durumunu isteyin
        * kosola bunu tek etiket ile yazdirin*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Adiniz girinz :");
        String ad = input.nextLine();

        System.out.println("Lütfen Soyadinizi Giriniz :");
        String soyad = input.nextLine();

        System.out.println("Lütfen Yasinizi Giriniz");
        int yas = input.nextInt();

        System.out.println("Lütfen Boyunuzu Giriniz");
        int boy = input.nextInt();

        System.out.println("Lütfen Kilonuzu Giriniz");
        int kilo = input.nextInt();

        System.out.println("Lütfen Medeni Durumunuzu Giriniz");
        String medeniDurum = input.next();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);
        System.out.println("medeniDurum = " + medeniDurum);
    }
}
