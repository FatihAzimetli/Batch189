package dayo2variables;

public class Variables01 {
    public static void main(String[] args) {

        //variable nasil olusturulur
        //Data Type + Variable name + Assignment operator + variable degeri + ;
        int                age           =                      13            ;

        System.out.println(age);

        //Javadaki data tipleri iki tanedir primitiv ve non-Primitiv
        //Primitiv data tipleri : char,,boolen, byte,short,int,long,double
        //Non-primitiv : Intiger;String,

        //char data tipinde bir ismin ilk harfi olarak variable olusturun ve deger atayin

        char IsminIlkHarfi = 'A' ;
        System.out.println("IsminIlkHarfi = " + IsminIlkHarfi);

        //boolean : "true", yada "false"

        boolean emeklimsin = false;
        System.out.println("emeklimsin = " + emeklimsin);

        //beyte +127 ve -128
        //Ögrenci yasi icin bir variable olusturun

        byte ogrenciYasi = 25;

        System.out.println("ogrenciYasi = " + ogrenciYasi);

        //short -32769 ile 32767 arasindaki sayilar
        // site nufusu icin bir variable olusturun
        short siteNufusu = 12565;
        System.out.println("siteNufusu = " + siteNufusu);

        //int data tipi +2,147.483,648 ile 2,147,483,647
        //ülke nufusu icin bir veriable olusturun
        int ulkeNufusu = 25676888;
        System.out.println("ulkeNufusu = " + ulkeNufusu);

        //long -9,233,372,036,854,775,808 ile+9,233,372,036,854,775,807

        //hücre sayisi variable olusturup deger atamasi yapiniz

        long hucreSayisi = 67699888765L;
        System.out.println("hucreSayisi = " + hucreSayisi);

        //float ondalikli sayilar icindir
        //gömlek fiyati icin bir variabl olusturun

        float gomlekFiyati = 34.99F;
        System.out.println("gomlekFiyati = " + gomlekFiyati);

        int x=1,y=2, r=3;
        r *=x+y;
        System.out.println("r = " + r);

        //hücre agirligi icin bir veriable olusturun
        double weightCell = 0.0000000000015;
        System.out.println("weightCell = " + weightCell);

        System.out.println("deneme github");


    }

}
