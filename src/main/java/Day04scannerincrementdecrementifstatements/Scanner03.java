package Day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        /*kullanicidan iki sayi alip bir dikdörgeni
        * alanini hesaplayin = uzunKenar*kisaKenar
        * Cevresini hesaplayin =2*uzunKenar+2*kisaKenar*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Kisa Kenar ölcüsünü Giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lütfen Uzun kenar ölcüsünü Giriniz");
        double sayi2 = input.nextDouble();

        double dikdortgenAlani = sayi1*sayi2;
        double dikdortgenCevtresi = 2*sayi1+2*sayi2;

        System.out.println("dikdortgenAlani = " + dikdortgenAlani);
        System.out.println("dikdortgenCevtresi = " + dikdortgenCevtresi);
    }
}
