package AnimalRescuier.food;

public class Food {

    private String name ;
    private double priceEuro ;
    private double amountKg ;
    private double availability ;

    public String getName(){
        return name;    }
    public void setName(String name) {
        this.name = name;     }


    public double getPriceEuro() {
        return priceEuro;    }

    public void setPriceEuro(double priceEuro) {
        this.priceEuro = priceEuro;     }

    public double getAmountKg() {
        return amountKg;     }

    public void setAmountKg(double amountKg) {
        this.amountKg = amountKg;
    }

    public double getAvailability() {
        return availability;     }
    public void setAvailability(double availability){
        this.availability=availability;
    }
}
