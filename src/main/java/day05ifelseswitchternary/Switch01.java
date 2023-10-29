package day05ifelseswitchternary;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*kullanicinin verdigi gün isimlerine göre kacinci gün oldugunu yazdiran kodu yaziniz*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kacinci gün adi giriniz");
        String günAdi =   input.next();

        switch (günAdi.toLowerCase()){
            case "pazar":
                System.out.println(1);
                break;
            case "pazartesi":
                System.out.println(2);
                break;
            case "sali":
                System.out.println(3);
                break;
            case "carsamba":
                System.out.println(4);
                break;
            case "persembe":
                System.out.println(5);
                break;
            case "cuma":
                System.out.println(6);
                break;
            case "cumaretesi":
                System.out.println(7);
                break;
            default:
                System.out.println("Gecerli bir gün adi giriniz");
        }

    }
}
