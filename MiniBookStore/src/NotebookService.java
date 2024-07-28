import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookService implements ProductService{
    //2.Adim : ProductService i implement et ve methodlari notebook a uygun sekilde doldurü

    //3-Adim : NoteBooklari saklamak icin list olusturalim
    List<Notebook> notebookList = new ArrayList<>();

    //4.Adim : Baslangicta kayitli defterler olsun
    public NotebookService(){
        Notebook notebook1= new Notebook(1, "Cizgili", "75", 5,"Adel","120");
        Notebook notebook2= new Notebook(1, "Kareli", "100", 10,"Adel","150");
    }



    @Override
    public void productMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1-Defterleri Listele");
            System.out.println("2-Defter Ekle");
            System.out.println("3-Defter Sil");
            System.out.println("4-Markaya Gore Defterleri Filtrele");
            System.out.println("0-Cikis");
            System.out.print("Seciminiz : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    System.out.println("Yayinevini giriniz");
                    String pub = scanner.next();
                    filterProduct(pub);
                    break;
                case 0:
                    System.out.println("Ana menuye yonlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali giris");
            }
        }





    }

    @Override
    public void listProduct() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void removeProduct() {

    }

    @Override
    public void filterProduct(String filter) {

    }
}
