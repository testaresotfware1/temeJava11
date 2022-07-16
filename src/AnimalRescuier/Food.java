package AnimalRescuier;

public class Food {

    private String name ="Fooddog";
    private double priceEuro = 50.5 ;
    private double amountKg = 2;
    private double availability = 2;

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
