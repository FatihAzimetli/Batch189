package Day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Birinci sayi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen Ikinci sayiyi Giriniz");
        int sayi2 = input.nextInt();

        int ikiSayiToplami = sayi1+sayi2;
        int ikiSayininCikarmasi = sayi1-sayi2;
        int ikiSayininBölmesi = sayi1/sayi2;
        int ikiSayininCarpimi = sayi1*sayi2;

        System.out.println("ikiSayiToplami = " + ikiSayiToplami);
        System.out.println("ikiSayininCikarmasi = " + ikiSayininCikarmasi);
        System.out.println("ikiSayininBölmesi = " + ikiSayininBölmesi);
        System.out.println("ikiSayininCarpimi = " + ikiSayininCarpimi);


    }
}
