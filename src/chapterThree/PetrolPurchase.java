package chapterThree;

public class PetrolPurchase {
    private  String name;
    private String type;
    private int quantity;
    private double price;
    private double discount;
    private double purchaseAmount;

    public PetrolPurchase(String name, String type, int quantity, double price, double discount, double purchaseAmount) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.purchaseAmount = purchaseAmount;
        this.discount = discount;
    }




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDiscount(double discount) {

        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        if (price < 0.00) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        if (purchaseAmount > 0.00) {
            purchaseAmount = quantity * price - discount;
            this.purchaseAmount = purchaseAmount;
        }
    }
}
