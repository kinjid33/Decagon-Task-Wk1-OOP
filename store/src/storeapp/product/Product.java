package storeapp.product;

public class Product {
    private String productName;
    private int productId;
    private int productPrice;
    public Product(){}

    public Product(String productName, int productId, int productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }
}
