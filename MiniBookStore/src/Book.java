public class Book extends Product {
    //book ozl: product ozl + author, publisher


    private String author;
    private String publisher;


    public Book(int id, String name, String price, int stock, String author, String publisher) {
        super(id, name, price, stock);
    }
}
