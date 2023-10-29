package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatemenst03 {
    public static void main(String[] args) {
       /*Kullanicinin verdigi yas degerine göre yasin hangi evrede oldugunu asagidaki tabloya göre yaziniz
       * 0-4 bebek
       * 5-12 cocuk
       * 13-20 genc
       * 21-30 yetiskin
       * 30 üstü tanimlammamis*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yas degeri giriniz");
        int yasDegeri = input.nextInt();

        if (yasDegeri<0){
            System.out.println("Tanimlanmamis lütfen yeniden yas degeri giriniz");
        } else if (yasDegeri<5) {
            System.out.println("Bebek");
        } else if (yasDegeri<13) {
            System.out.println("Cocuk");
        } else if (yasDegeri<21) {
            System.out.println("Genc");
        } else if (yasDegeri<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis yas degeri lütfen yeni yas degeri giriniz");
        }


    }
}
