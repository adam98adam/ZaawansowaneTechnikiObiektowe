package lab1.creatures;

import lab1.Human;

public abstract class  Animal implements Salleable,Feedable {
    final String species;
    private Double weight;
    private Double defaultFoodWeight;

    Animal(String species) {
        switch (species) {
            case "amphibian":
                this.weight = 30.0;
                this.defaultFoodWeight = 10.0;
                break;
            case "mammal":
                this.weight = 50.0;
                this.defaultFoodWeight = 5.0;
                break;
            default:
                this.weight = 40.0;
                this.defaultFoodWeight = 2.0;
                break;
        }
        this.species = species;
    }

    public void takeForAWALK(){
        if(weight > 0) {
            this.weight = this.weight - 5.00;
        } else {
            System.out.println("Zdechl !!!! Nie ma czego wyprowadzac na spacer 🙂");
        }
    }

    @Override
    public String toString() {
        return "lab1.creatures.Animal{" +
                "speceis='" + species + '\'' +
                ", weight='" + weight + '\'' +
                ", defaultFoodWeight='" + defaultFoodWeight + '\'' +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPet() != null) {
            if(buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setPet(seller.getPet());
                seller.setPet(null);
            } else {
                System.out.println("Kupujacy ma za malo pieniedzy !!!");
            }
        } else {
            System.out.println("Sprzedajacy nie posiada telefounu !!!");
        }

    }

    @Override
    public void feed() {
        feed(defaultFoodWeight);
    }

    @Override
    public void feed(Double foodWeight) {
        this.weight = foodWeight + this.weight;
    }

    public Double getDefaultFoodWeight() { return defaultFoodWeight; }

    public void setDefaultFoodWeight(Double defaultFoodWeight) { this.defaultFoodWeight = defaultFoodWeight; }
}
