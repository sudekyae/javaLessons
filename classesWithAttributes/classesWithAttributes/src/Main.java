//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"siyah");

//        Product product = new Product();
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(50000);
//        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}