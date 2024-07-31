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
        System.out.println("===================================");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s  \n",
                "ID", "Defter adi", "Fiyat", "Stok", "Marka", "Sayfa Sayisi");
        for (Notebook notebook : notebookList) {
            System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s  \n",
                   notebook.getId()+ notebook.getName() +notebook.getPrice() +notebook.getStock() +notebook.getBrand() +notebook.getSheet());
        }
        System.out.println("===================================");

    }

   //7.Adim: Kullanicidan alinan bilgilerle Notebook obj olusturulacak ve listeye eklenecek
    @Override
    public void addProduct() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Defter Adi : ");
        String notebookName = inp.nextLine();
        System.out.println("Birim Fiyat : ");
        String price = inp.nextLine();
        System.out.println("Stok : ");
        int stock = inp.nextInt();
        inp.nextLine();
        System.out.println("Marka : ");
        String brand = inp.nextLine();
        System.out.println("Sayfa Sayisi  : ");
        String sheet = inp.nextLine();

        Notebook newNotebook= new Notebook(this.notebookList.get(this.notebookList.size()-1). getId()+1, notebookName,price,stock, brand, sheet);
        this.notebookList.add(newNotebook);
    }

    @Override
    public void removeProduct() {
        Scanner inp = new Scanner(System.in);

        System.out.println("Id : ");
        int id=inp.nextInt();
        boolean isExist=true;
        for (Notebook notebook: notebookList){
            isExist=true;
            if (notebook.getId()==id){
                this.notebookList.remove(id);
                System.out.println("Defter silindi");
                break;

            }else {
                isExist=false;
            }
           if (!isExist){
               System.out.println("Defter bulunamadi");
            }
        }


    }

    @Override
    public void filterProduct(String filter) {

    }
}
