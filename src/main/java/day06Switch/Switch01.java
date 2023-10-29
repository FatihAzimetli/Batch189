package day06Switch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*Ay numarasi verilince, verilen aydan itibaren son aya kadar tüm aylarin ismini yazan kodu yazdirin*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangic ayini giriniz");
        int aySayisi = input.nextInt();

        switch (aySayisi){
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Subat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayis");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Agustos");
            case 9:
                System.out.println("Eylul");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasim");
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli ay numarsini giriniz");
        }




    }
}
