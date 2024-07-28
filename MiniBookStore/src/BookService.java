import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService {
    //2.Adim : ProductService i implement et ve methodlari book a uygun sekilde doldur
    //3-Adim : Booklari saklamak icin list olusturalim
    List<Book> bookList = new ArrayList<>();

    //4.Adim : Baslangicta kayitli kitaplar olsun
    public BookService() {
        Book book1 = new Book(1, "Vadideki Zambak", "150", 25, "Balzac", "Penguin");
        Book book2 = new Book(2, "Suc ve Ceza", "150", 12, "Dostoyevski", "Penguin");
        Book book3 = new Book(3, "Sefiller", "125", 12, "Victor Hugo", "Dream");

        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }


    //5. Adim:bookla ilgili islemleri gosteren bir menu
    @Override
    public void productMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1-Kitaplari Listele");
            System.out.println("2-Kitap Ekle");
            System.out.println("3-Kitap Sil");
            System.out.println("4-Yayinevine Gore Kitaplari Filtrele");
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

    //6.Adim: booklari formatla yazdirlim

    @Override
    public void listProduct() {
        System.out.println("===================================");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s  \n",
                "ID", "Kitap Adi", "Yazari", "Yayinevi", "Birim Fiyat", "Stok");
        for (Book book : bookList) {
            System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s  \n",
                    book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(),
                    book.getPrice(), book.getStock());
        }
        System.out.println("===================================");


    }

    //7.Adim: Kullanicidan alinan bilgilerle Book obj olusturulacak ve listeye eklenecek
    @Override
    public void addProduct() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kitap Adi : ");
        String bookName = inp.nextLine();
        System.out.println("Yazar Adi : ");
        String authorName = inp.nextLine();
        System.out.println("Yayinevi  : ");
        String pub = inp.nextLine();
        System.out.println("Birim Fiyat : ");
        String price = inp.nextLine();
        System.out.println("Stok : ");
        int stock = inp.nextInt();

        Book newBook = new Book(this.bookList.get(this.bookList.size() - 1).getId() + 1, bookName, price, stock, authorName, pub);
        this.bookList.add(newBook);

    }

    //Kullanicidan id al. id ile book bul, listeden kaldir.
    @Override
    public void removeProduct() {
        Scanner inp = new Scanner(System.in);
        boolean isExist = true;
        System.out.println("Kitap ID: ");
        int id = inp.nextInt();
        for (Book book : bookList) {
            if (book.getId() == id) {
                isExist = true;
                this.bookList.remove(id);
                System.out.println("Kitap silindi");
                break;
            } else {
                isExist = false;
            }
        }
        if (!isExist) {
            System.out.println("Kitap bulunamadi");
        }
    }

    //9. Adim: filtreleme methodu- tum kitaplarin yayinevine bak filter ile ayni ise bilgileri geti
    @Override
    public void filterProduct(String filter) {
        for (Book book : bookList) {
            if (book.getPublisher().equalsIgnoreCase(filter)) {
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s  \n",
                        book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(),
                        book.getPrice(), book.getStock());
            }
        }
    }


}
