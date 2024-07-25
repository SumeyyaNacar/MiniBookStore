public interface ProductService {
    //ihtiyacim olan butun productlarin methodlari burada yer alacak

    void productMenu();
    void listProduct();
    void addProduct();
    void removeProduct();
    void filterProduct(String filter);//kullanicidan alicak degere gore listeleme yapilacak

}
