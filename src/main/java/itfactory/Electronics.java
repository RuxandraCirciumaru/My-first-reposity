package itfactory;

public class Electronics extends Product{
    private int votaj;

    public Electronics(String name,double price,int discount,int voltaj){
        super(name, price, discount);
        this.votaj =voltaj;
    }

    public double calculatePrice() {
        if( votaj < 220 || votaj > 240){
            System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");
            return 0;
        }
        return calculateDefaultPrice();

    }
}

