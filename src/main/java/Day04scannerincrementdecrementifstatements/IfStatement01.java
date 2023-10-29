package Day04scannerincrementdecrementifstatements;

public class IfStatement01 {
    public static void main(String[] args) {

        //örnek sayi -1 ile 10 arasinda ise ekrana rakam yazdirin

        int num = 3;

        if(num>-1 && num <10){
            System.out.println("Rakam");
        }

        //Sayi 3 basamakli ise ekrana sayi üc basmaklidir yazdirin

        int sayi =12;

        if (sayi>99 && sayi <1000){
            System.out.println("Sayi üc basmaklidir");
        }else{
            System.out.println("Lütfen uc basamakli sayi girin");
        }







    }
}
