package day03wrapperconcatenationoperators;

public class Operators {
    public static void main(String[] args) {

        int kisiSayisi = 10;
        int paraMiktari = 25;
        System.out.println(paraMiktari/kisiSayisi);

        int ogrenciSayisi = 10;
        double ucretMiktari = 25;
        System.out.println(ucretMiktari/ogrenciSayisi);

        /*NOT (&&), OR(||) ! (degildir)
        * Comparison <, >, <=, >=, ==, !=,
        * karsilastirma operatörlerinde sonuc boolean olur (false veya true) */



        boolean first = 3<5; //true
        boolean second = 2 +3 != 5; // false
        boolean third = 2+3*5 >= 19; //false

        System.out.println(first && second); //false
        System.out.println(first || second || third); //true

    }
}
