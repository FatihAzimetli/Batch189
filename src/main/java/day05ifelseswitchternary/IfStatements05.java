package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
        /*Kullanicidan 0'dan kücük 120'den büyük degerleri aldiktan sonra
        * eger calisan kadin ise  ve 60 yasindan büyükse emekli olabilir yazdirin
        * Eger calisan Erkekse 65 yasindan büyükse emekli olabilir yazdirin*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi Giriniz");
        String cinsiyet = input.next();
        System.out.println("Lütfen Yasiniz Giriniz");
        int yas = input.nextInt();



        if (cinsiyet.equalsIgnoreCase("Bayan")){
            if (yas<0 ||yas>120){
                System.out.println("Lütfen 0 ile 120 arasi yas giriniz");
            }else if (yas<60){
                System.out.println("Emekli olamaz");
            }else{
                System.out.println("Emekli olabilir");
            }
        }else if (cinsiyet.equalsIgnoreCase("Bay")){
            if (yas<0 ||yas>120){
                System.out.println("Lütfen 0 ile 120 arasi yas giriniz");
            }else if (yas<65){
                System.out.println("Emekli olamaz");
            }else{
                System.out.println("Emekli olabilir");
            }
        }else{
            System.out.println("Hatali giris.!! Lütfen cinsiyet bilginizi giriniz");
        }










    }






}
