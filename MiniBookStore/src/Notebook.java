public class Notebook extends Product {
    //notebook ozl: product ozl + brand, sheet

    private String brand;
    private String sheet;

    public Notebook(int id, String name, String price, int stock, String brand, String sheet) {
        super(id, name, price, stock);
    }
}
