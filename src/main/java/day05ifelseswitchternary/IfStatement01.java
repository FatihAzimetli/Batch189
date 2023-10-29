package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //verilen bir sayinin pozitif, negatif yada nötür oldugunu kontrol eden kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
         int sayi = input.nextInt();

         if(sayi>0){
             System.out.println("sayi pozitif");
         } else if (sayi<0) {
             System.out.println("Sayi negatiftir");
         }else{
             System.out.println("Sayi nötürdür");
         }

    }
}
