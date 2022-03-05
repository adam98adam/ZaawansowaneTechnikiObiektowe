package lab1;

public class Animal implements Salleable {
    final String species;
    private Double weight;


    Animal(String species) {
        switch (species) {
            case "amphibian":
                this.weight = 30.0;
                break;
            case "mammal":
                this.weight = 50.0;
                break;
            default:
                this.weight = 40.0;
                break;
        }
        this.species = species;
    }

    public void feed() {
        if(weight > 0) {
            this.weight = this.weight + 5.00;
        } else {
            System.out.println("Zdechl !!!! Nie ma co dokarmiac 🙂");
        }
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
        return "lab1.Animal{" +
                "speceis='" + species + '\'' +
                ", weight='" + weight + '\'' +
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
}
