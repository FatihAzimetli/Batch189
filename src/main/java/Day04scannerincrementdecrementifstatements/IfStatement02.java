package Day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Kullanicidan alinan sayinin tekmi ciftmi oldugunu göstern kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
       int sayi = input.nextInt();

       if(sayi%2 == 0){
           System.out.println("Cift sayi");
       }else{
           System.out.println("Tek sayi");
       }
    }
}
