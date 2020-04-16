package az.stepit.desingPatterns.startegy;

import java.util.List;

public class Basket {
    private long id;
    private List<Product> productList;

    public Basket(long id, List<Product> productList) {
        this.id = id;
        this.productList = productList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
