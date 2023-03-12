package SoalPrioritas3;
public class main {
    
    public static void main(String[] args) {
        
        System.out.println("===");
        System.out.println("INFO PRODUK");
        Product product = new Product("coffee", "this is coffee", 15000, 10);
        product.getInfo();
        
    
        System.out.println("===");
        System.out.println("INFO PRODUK");
        product.setName("milk");
        product.setPrice(25000);
        product.setStock(10);
        product.getInfo();

        System.out.println("===");
        System.out.println("INFO PRODUK");
        product.setName("apple juice");
        product.setPrice(18000);
        product.setStock(20);
        product.getInfo();

    }
    
}
