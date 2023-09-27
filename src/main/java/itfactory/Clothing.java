package itfactory;

public class Clothing extends Product{
    private String type;
    public Clothing(String name,double price,int dicount,String type){
        super(name,price,dicount);
        this.type = type;
    }
    public double calculatePrice(){
        switch (type){
            case "pantaloni":
                setDiscount(10);
                break;
            case "bluza":
                setDiscount(20);
                break;
            case "accesoriu":
                setDiscount(30);
                break;
        }
        return calculateDefaultPrice();

    }
}
