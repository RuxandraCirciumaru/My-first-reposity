package itfactory;

public class Product {
    private String name;

    private double price;
    private int discount;

    public Product(String name, double price,int discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public void setDiscount(int discount){
        if (discount < 0 || discount > 100){
            System.out.println("Discountul aplicat trebuie sa fie intre 0 si 100");
            return;
        }
        this.discount = discount;
    }

    protected double calculateDefaultPrice(){
        return price - (price * discount / 100);
    }

}
