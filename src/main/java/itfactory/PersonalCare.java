package itfactory;

public class PersonalCare extends Product{
    private boolean returnable;

    public PersonalCare (String name, double price,int discount,boolean returnable){
        super(name,price,discount);
        this.returnable = returnable;
    }
    public double calculatePrice(){
        if (returnable){
            setDiscount(20);
        }
        return calculateDefaultPrice();

    }
}
