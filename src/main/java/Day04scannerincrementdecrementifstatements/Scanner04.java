package Day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu hesaplayin
        // 45678 ==> 45+78 = 123


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5 basamakli bir tam sayi giriniz");
        int sayi = input.nextInt();

        int ilkIkiBasamak = sayi/1000;
        int sonIkiBasamak = sayi%100;

        int toplamSonucu =ilkIkiBasamak+sonIkiBasamak;

        System.out.println("toplamSonucu = " + toplamSonucu);


    }
}
