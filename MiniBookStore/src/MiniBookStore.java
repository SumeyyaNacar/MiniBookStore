import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    }

    //1. adim : product, book ve notebook classlari olustur



    private static void enter() {
        //10. Adim: kategori menu
        Scanner scanner = new Scanner(System.in);
        int select =-1;
        while (select!=0){
            System.out.println("Urun Yonetim Paneli");
            System.out.println("1-Kitaplar");
            System.out.println("2-Defterler");
            System.out.println("0-Cikis");
            System.out.println("Seciminiz : ");
            select = scanner.nextInt();

            //ProductService i referans alarak service olustur
            //interface tipinde bir variable olustur ve karsi tarafa ilgili class constr. koy
            ProductService service = select==1?new BookService():new NotebookService();

            //select==1-> BookService service1 = new BookService();
            //select==2-> NotebookService service1 = new NotebookService();

            if (select==1||select ==2){
                service.productMenu();
            }else if (select ==0){
                System.out.println("Iyi gunler....");
            }else {
                System.out.println("Hatali giris...");
            }


        }




    }


}
