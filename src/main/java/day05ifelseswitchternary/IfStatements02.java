package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //gün sayisi verdigimizde gün ismini yazan kodu yaziniz pazar-->1

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ögrenmek istediginiz gün icin bir sayi giriniz");
         byte gunSayisi = input.nextByte();

         if(gunSayisi==1){
             System.out.println("Pazar");
         } else if (gunSayisi==2) {
             System.out.println("Pazartesi");
         } else if (gunSayisi==3) {
             System.out.println("Sali");
         } else if (gunSayisi==4) {
             System.out.println("Carsamba");
         } else if (gunSayisi==5) {
             System.out.println("Persembe");
         } else if (gunSayisi==6) {
             System.out.println("Cuma");
         } else if (gunSayisi==7) {
             System.out.println("Cumartesi");
         }else{
             System.out.println("Lütfen 1-7 arasinda bir sayi giriniz");
         }


    }
}
