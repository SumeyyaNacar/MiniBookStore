import java.util.ArrayList;
import java.util.List;

public class MiniBookStore {
/*
Proje: Mini Book Story
       Online bir kitap market icin urun yonetim uygulamasi yapiniz.
       Kitap markette kitap ve defter satisi olacak. Ancak ileride yeni urun cesidi eklenebilir olmali

       Kitap ozellikleri : id, isim, birim fiyet, stock, yazar adi, yayinevi
       Defter ozellikleri : id, isim, birim fiyet, stock, marka, yaprak sayisi

       Kullanici ilgili kategorideki urunleri listeleyebilmeli
       Kullanici kategoriye gore urun ekleyebilmeli
       Kullanici urunleri benzersiz numaralarina gore silebilmeli
       Kullanici urunleri marka(kitap) veya yayinevine gore filtreleyip listeleyebilmeli

*/

    public static void main(String[] args) {
        enter();

        List<Integer> arr2= new ArrayList<>();
        arr2.add(5);
        arr2.add(5);
        arr2.add(8);
        arr2.add(7);
        arr2.add(5);

        List<Integer> arr3= new ArrayList<>();
        arr3.add(6);
        arr3.add(6);
        arr3.add(6);
        arr3.add(6);
        arr3.add(6);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(0,arr2);
        arr.add(1,arr3);




        System.out.println(arr.get(0).get(2));
        System.out.println("Math.abs(5-7) = " + Math.abs(5 - 7));
    }

    //1. adim : product, book ve notebook classlari olustur


    private static void enter() {
    }


}
