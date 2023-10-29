package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements04 {
    /*Kullanicinin verdigi isimlere bakarak hafta sonu veya hafta ici olduguna karar veren kodu yaziniz
    * pazar veya cumaetesu --> hafta sonu diger günler hafta ici*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün adi giriniz");
        String gunAdi = input.next();

        boolean haftaSonumu =gunAdi.equalsIgnoreCase("Pazar")
                || gunAdi.equalsIgnoreCase("Cumartesi");

        boolean haftaIcimi =gunAdi.equalsIgnoreCase("Pazartesi")
                || gunAdi.equalsIgnoreCase("Sali")
                || gunAdi.equalsIgnoreCase("Carsamba")
                ||gunAdi.equalsIgnoreCase("Persembe")
                ||gunAdi.equalsIgnoreCase("Cuma");

        if (haftaSonumu){
            System.out.println("Hafta sonu");
        } else if (haftaIcimi) {
            System.out.println("Hafta ici");
        }else {
            System.out.println("Lütfen gecerli bir gün ismi giriniz");
        }


    }
}
